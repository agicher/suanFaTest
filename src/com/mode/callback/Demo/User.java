package com.mode.callback.Demo;

public class User {
    Long Id;
    String Name;
    String Telephone;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
       this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
}
