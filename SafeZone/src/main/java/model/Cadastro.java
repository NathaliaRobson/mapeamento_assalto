package model;

public class Cadastro {
    private String cadId;
    private String username;
    private String email;
    private String password;
    private String passwordConf;

    public Cadastro(String cadId, String usernome, String email, String password, String passwordConf) {
        this.cadId = cadId;
        this.username = usernome;
        this.email = email;
        this.password = password;
        this.passwordConf = passwordConf;
    }

    public String getCadId() {
        return cadId;
    }

    public void setCadId(String cadId) {
        this.cadId = cadId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsernome(String usernome) {
        this.username = usernome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConf() {
        return passwordConf;
    }

    public void setPasswordConf(String passwordConf) {
        this.passwordConf = passwordConf;
    }
}
