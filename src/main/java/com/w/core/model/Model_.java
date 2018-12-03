package com.w.core.model;

import com.w.core.annotation.DefaultValue;
import org.springframework.util.StringUtils;

import java.util.UUID;

public class Model_ {

    private String id;

    private String code;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
