package com.w.core.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class Model_ implements Serializable {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String code;

    @Getter
    @Setter
    private String name;

}
