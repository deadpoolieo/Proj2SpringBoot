package com.example.springbootproj1.entity;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username; // 名字
    private String password; // 密码
    private String admin; //用户类型
}
