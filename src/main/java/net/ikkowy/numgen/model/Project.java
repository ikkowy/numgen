package net.ikkowy.numgen.model;

import jakarta.persistence.*;

@Entity
public class Project extends BaseEntity {

    private Boolean active;

    @Column(unique = true)
    private String number;

    private String description;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
