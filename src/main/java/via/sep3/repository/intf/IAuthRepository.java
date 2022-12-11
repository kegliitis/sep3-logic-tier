package via.sep3.repository.intf;

import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;

public interface IAuthRepository {

    User register(RegisterUser user);
    User login(LoginUser user);
    User getUserByEmail(String email);
}
