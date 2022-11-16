package via.sep3.repository;

import org.springframework.stereotype.Repository;
import via.sep3.grpcclient.client.AuthClient;
import via.sep3.grpcclient.implementation.AuthClientImpl;
import via.sep3.intf.IAuthRepository;
import via.sep3.model.RegisterUser;

@Repository
public class AuthRepository implements IAuthRepository {
    AuthClient authClient = new AuthClientImpl();

    public boolean register(RegisterUser user) {
        return authClient.register();
    }
}
