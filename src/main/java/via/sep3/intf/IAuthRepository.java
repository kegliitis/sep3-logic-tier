package via.sep3.intf;

import via.sep3.model.RegisterUser;

public interface IAuthRepository {

    boolean register(RegisterUser user);
}
