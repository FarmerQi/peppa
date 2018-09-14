package com.peppa.dal.model;

import lombok.Data;

@Data
public class UserDO {
    private Integer id;

    private String name;

    private String phone;

    private String password;

    private String salt;

    private String state;


    /**
     * 密码盐
     * @return
     * 使用用户名 + salt 作为新的密码盐来加大破解难度
     */
    public String getCredentialsSalt(){
        return this.salt + this.name;
    }
}