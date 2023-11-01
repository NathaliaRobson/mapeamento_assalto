package model;

public class Reportar {
    private String id;
    private String name;
    private String email;
    private String Zona;
    private String Bairro;
    private String Anonimo;
    private String mensagem;

    public Reportar(String name, String email, String zona, String bairro, String anonimo, String mensagem) {

        this.name = name;
        this.email = email;
        this.Zona = zona;
        this.Bairro = bairro;
        this.Anonimo = anonimo;
        this.mensagem = mensagem;
    }

    public Reportar(String id, String repName, String repEmail, String repZona, String repBairro, String repAnonimo, String repMensagem) {
        this.id = id;
        this.name = repName;
        this.email = repEmail;
        this.Zona = repZona;
        this.Bairro = repBairro;
        this.Anonimo = repAnonimo;
        this.mensagem = repMensagem;
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZona() {
        return Zona;
    }

    public void setZona(String zona) {
        Zona = zona;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getAnonimo() {
        return Anonimo;
    }

    public void setAnonimo(String anonimo) {
        Anonimo = anonimo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}

