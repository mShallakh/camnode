package edu.birzeit.camnode;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    int id;

    @Column
    String name;


    @Column
    String publicKey;

    @Column(length=1024)
    String privateKey;

    @Basic(optional=true)
    String companyURL;

    @Column
    int type;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }


    public User(String name, String publicKey, int type) {
        this.name = name;
        this.publicKey = publicKey;
        this.type = type;
    }

    public User(String name, String publicKey, String companyURL, int type) {
        this.name = name;
        this.publicKey = publicKey;
        this.companyURL = companyURL;
        this.type = type;
    }

    public User(String name, String publicKey, int type, String privateKey) {
        this.name = name;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
}
