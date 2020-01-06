/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalTheory;

/**
 *
 * @author Student
 */
/*public*/ interface IUserChecking {

    public boolean login(String username, String password);

    public void logout(String username);
}

/*public*/ class MyUserChecking implements IUserChecking {

    @Override
    public boolean login(String username, String password) {
        /*...DO SOMETHING HERE...*/
        return true;
    }

    @Override
    public void logout(String username) {
        /*...DO SOMETHING HERE...*/
    }

}

public class MySystem {

    private IUserChecking _userChecking;

    public void setUserChecking(IUserChecking value) {
        _userChecking = value;
    }

    public boolean userLogin(String username, String password) {
        return _userChecking.login(username, password);
    }

}
