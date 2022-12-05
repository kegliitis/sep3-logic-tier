package via.sep3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import via.sep3.controller.utils.jwt.JwtTokenUtil;
import via.sep3.repository.intf.IAuthRepository;
import via.sep3.model.LoginUser;
import via.sep3.model.RegisterUser;
import via.sep3.model.User;
import via.sep3.repository.implementation.AuthRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/")
public class AuthController {
    private JwtTokenUtil jwtTokenUtil;
    private IAuthRepository authRepository;

    public AuthController(AuthRepository authRepository, JwtTokenUtil jwtTokenUtil) {
        this.authRepository = authRepository;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity register(@RequestBody RegisterUser registerUser) {
        try {
            User user = authRepository.register(registerUser);

            if (user == null) {
                throw new Exception("The user couldn't be registered. Please try again later!");
            }

            String token = jwtTokenUtil.generateToken(user);

            return ResponseEntity.ok(token);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginUser loginUser) {
        try{
            User user = authRepository.login(loginUser);
            String token = jwtTokenUtil.generateToken(user);

            return ResponseEntity.ok(token);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }
}
