package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;
import via.sep3.protobuf.auth.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Service
public class AuthClient implements via.sep3.grpcclient.client.IAuthClient {
    private ManagedChannel managedChannel = ManagedChannelBuilder
            .forAddress("localhost", 5266)
            .usePlaintext()
            .build();

    private AuthGrpc.AuthBlockingStub authBlockingStub = AuthGrpc.newBlockingStub(managedChannel);

    @Override
    public User register(RegisterUser user) {
        RegisterUserInput input = RegisterUserInput.newBuilder()
                .setEmail(user.getEmail())
                .setUsername(user.getUserName())
                .setPassword(user.getPassword())
                .build();
        UserOutput response = authBlockingStub.register(input);

        List authorities = new ArrayList();
        authorities.add(response.getRole());

        return new User(response.getId(),  response.getUsername(), response.getPassword(), response.getEmail(), authorities);
    }

    @Override
    public User login(LoginUser user) {
        LoginUserInput input = LoginUserInput.newBuilder()
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .build();
        UserOutput response = authBlockingStub.loginUser(input);

        List authorities = new ArrayList();
        authorities.add(response.getRole());

        return new User(response.getId(),  response.getUsername(), response.getPassword(), response.getEmail(), authorities);
    }

    @Override
    public User getUserByEmail(String email) throws UsernameNotFoundException {
        return new User("123", "Edy", "myPassword", "edy@via.dk",new ArrayList());
    }
}
