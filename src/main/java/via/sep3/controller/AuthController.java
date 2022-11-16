package via.sep3.controller;

import org.springframework.web.bind.annotation.*;
import via.sep3.intf.IAuthRepository;
import via.sep3.model.RegisterUser;
import via.sep3.repository.AuthRepository;

@RestController
@RequestMapping("/")
public class AuthController {

    private IAuthRepository authRepository;

    public AuthController(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    @PostMapping("/register")
    @ResponseBody
    public String register(@RequestBody RegisterUser user) throws Exception {
        try{

            boolean isRegister = authRepository.register(user);

            if(!isRegister){
                throw new Exception("The user couldn't be registered. Please try again later!");
            }


            return "";
        } catch (Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
    }
}

