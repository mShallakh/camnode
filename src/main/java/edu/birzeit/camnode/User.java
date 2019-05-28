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
}
