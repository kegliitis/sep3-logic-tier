package via.sep3.repository.implementation;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.IAuthClient;
import via.sep3.grpcclient.implementation.AuthClient;
import via.sep3.repository.intf.IAuthRepository;
import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;

@Repository
public class AuthRepository implements IAuthRepository {
    public IAuthClient authClient;

    public AuthRepository(AuthClient authClient){
        this.authClient = authClient;
    }

    public User register(RegisterUser user) {
        return authClient.register(user);
    }
    public User login(LoginUser user) {
        return authClient.login(user);
    }
    public User getUserByEmail(String email) {return authClient.getUserByEmail(email);}
}
