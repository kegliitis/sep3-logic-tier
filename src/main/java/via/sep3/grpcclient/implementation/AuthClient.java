package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;
import via.sep3.protobuf.auth.AuthGrpc;
import via.sep3.protobuf.auth.RegisterUserInput;
import via.sep3.protobuf.auth.RegisterUserOutput;

import java.util.ArrayList;

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
        RegisterUserOutput response = authBlockingStub.register(input);

        return new User("123", "Edy", "myPassword", "edy@via.dk",new ArrayList());
    }

    @Override
    public User login(LoginUser user) {
        return new User("123", "Edy", "myPassword", "edy@via.dk",new ArrayList());
    }

    @Override
    public User getUserByEmail(String email) throws UsernameNotFoundException {
        return new User("123", "Edy", "myPassword", "edy@via.dk",new ArrayList());
    }
}
