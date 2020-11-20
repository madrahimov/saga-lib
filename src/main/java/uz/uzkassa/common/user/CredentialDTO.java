package uz.uzkassa.common.user;

import java.io.Serializable;


public class CredentialDTO implements Serializable {


    protected String login;

    protected String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
