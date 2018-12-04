package com.w.core.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class UserModel extends Model_ implements Serializable {

    @Getter
    @Setter
    private String password;
}
