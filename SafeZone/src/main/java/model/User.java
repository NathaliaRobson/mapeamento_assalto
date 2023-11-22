package model;

public class User {

    private String username;
   // private String email;
    private String password;
   // private String passwordConf;

    public User(String username, String password) {
        this.username = username;
        //this.email = email;
        this.password = password;
        //this.passwordConf = passwordConf;
    }

    public String getUsername() {
        return username;
    }

    /*public void setNome(String nome) {
        this.username = nome;
    }*/

    /*public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }*/

    public String getPassword() {
        return password;
    }

    /*public void setPassword(String password) {
        this.password = password;
    }*/

   /* public String getPasswordConf() {
        return passwordConf;
    }

    public void setPasswordConf(String passwordConf) {
        this.passwordConf = passwordConf;
    }*/
}
