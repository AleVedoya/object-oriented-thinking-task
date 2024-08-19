package org.example.entities;

import org.example.entities.enums.Role;

public class Admin extends User{

    public Admin() {
    }

    public Admin(Long id, String name, String password, Role role) {
        super(id, name, password, role);
    }



}
