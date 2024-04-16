package Controllers;

import Common.ServiceLocator;
import Services.Abstruction.IAuthenticationService;

public class AuthenticationController {
    private IAuthenticationService _authenticationService;

    public AuthenticationController(){
        _authenticationService = ServiceLocator.getAuthenticationService();
    }

    public boolean login(String userName, String password) {
        return _authenticationService.authenticate(userName, password);
    }

    public boolean registration(String userName, String password) {
        return _authenticationService.registration(userName, password);
    }
}
