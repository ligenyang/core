package com.w.core.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class User extends Core implements Serializable {

    @Getter
    @Setter
    private String password;
}
