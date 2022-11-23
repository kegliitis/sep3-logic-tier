package via.sep3.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class User extends org.springframework.security.core.userdetails.User{
    private String id;
    private String email;

    public User(String id, String userName, String password, String email, Collection<GrantedAuthority> authorities) {
        super(userName, password, authorities);
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
