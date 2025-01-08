package net.ikkowy.numgen.model;

import jakarta.persistence.*;

@Entity
@Table(name = "\"user\"")
public class User extends BaseEntity {

    private Boolean active = true;

    @Column(unique = true)
    private String username;

    private String passwordHash;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

}
