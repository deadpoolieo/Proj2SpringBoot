package com.example.springbootproj1.service;


import com.example.springbootproj1.entity.Idrelateadmin;

import java.util.List;

public interface UserService {
    List<Idrelateadmin> QueryUser(String username, String password, String admin);
}
