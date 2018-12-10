package com.w.core.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class User extends Core implements Serializable {

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
