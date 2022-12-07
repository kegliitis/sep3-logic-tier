package via.sep3.grpcclient.implementation;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import via.sep3.controller.utils.jwt.ChannelUtils;
import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;
import via.sep3.protobuf.auth.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class AuthClient implements via.sep3.grpcclient.client.IAuthClient {
    private ManagedChannel managedChannel = ChannelUtils.getInstance();
    private AuthGrpc.AuthBlockingStub authBlockingStub = AuthGrpc.newBlockingStub(managedChannel);

    @Override
    public User register(RegisterUser user) {
            RegisterUserInput input = RegisterUserInput.newBuilder()
                .setEmail(user.getEmail())
                .setUsername(user.getUserName())
                .setPassword(user.getPassword())
                .build();
        UserOutput response = authBlockingStub.register(input);

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(response.getRole()));

        return new User(response.getId(),  response.getUsername(), response.getPassword(), response.getEmail(), grantedAuthorities);
    }

    @Override
    public User login(LoginUser user) {
        LoginUserInput input = LoginUserInput.newBuilder()
                .setEmail(user.getEmail())
                .setPassword(user.getPassword())
                .build();
        UserOutput response = authBlockingStub.loginUser(input);


        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(response.getRole()));

        return new User(response.getId(),  response.getUsername(), response.getPassword(), response.getEmail(), grantedAuthorities);
    }

    @Override
    public User getUserByEmail(String email) throws UsernameNotFoundException {
        GetUserByEmailInput input = GetUserByEmailInput.newBuilder()
                .setEmail(email)
                .build();

        UserOutput response = authBlockingStub.getUserByEmail(input);

        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(response.getRole()));

        return new User(response.getId(),  response.getUsername(), response.getPassword(), response.getEmail(), grantedAuthorities);
    }
}
