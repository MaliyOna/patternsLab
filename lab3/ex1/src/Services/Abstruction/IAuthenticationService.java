package Services.Abstruction;

import Services.AuthenticationService;

public interface IAuthenticationService {
    boolean authenticate(String username, String password);
    static AuthenticationService getInstance(){
        return null;
    };
}
