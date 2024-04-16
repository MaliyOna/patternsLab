package Models;

public class User {
    private String _userName;
    private String _password;

    public User(String userName, String password) {
        _password = password;
        _userName = userName;
    }

    public String getUserName(){
        return  _userName;
    }

    public String getPassword(){
        return _password;
    }
}
