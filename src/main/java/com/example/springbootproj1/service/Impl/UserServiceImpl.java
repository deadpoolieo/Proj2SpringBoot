package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Idrelateadmin;
import com.example.springbootproj1.mapper.queryuser;
import com.example.springbootproj1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private queryuser queryuser;

    @Override
    public List<Idrelateadmin> QueryUser(String username, String password, String admin){
        return queryuser.Queryuserrelatepermission(username,password,admin);
    }
}
