package com.peppa.dal.model;

import lombok.Data;

@Data
public class RoleDO {
    private Integer id;

    private String name;

    private String description;

    private Integer available;


}