package Services;

import Models.User;
import Services.Abstruction.IAuthenticationService;

import java.util.ArrayList;
import java.util.List;

public class AuthenticationService implements IAuthenticationService {
    private static AuthenticationService instance;
    private List<User> userList;

    private AuthenticationService(){
        userList = new ArrayList<>();
        userList.add(
                new User("admin", "admin")
        );
    }

    public static AuthenticationService getInstance() {
        if (instance == null) {
            instance = new AuthenticationService();
        }
        return instance;
    }

    public boolean registration(String userName, String password) {
        for (User user : userList) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }

        userList.add(new User(userName, password));
        return true;
    }

    public boolean authenticate(String username, String password) {
        for (User user : userList) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
