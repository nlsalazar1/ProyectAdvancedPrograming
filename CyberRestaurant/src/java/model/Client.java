
package model;

public class Client {
    
    String idClient;
    String firstname;
    String lastname;
    String telephone;
    String mail;

    public Client(String idClient, String firsname, String lastname, String telephone, String mail) {
        this.idClient = idClient;
        this.firstname = firsname;
        this.lastname = lastname;
        this.telephone = telephone;
        this.mail = mail;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public String getFirsname() {
        return firstname;
    }

    public void setFirsname(String firsname) {
        this.firstname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
