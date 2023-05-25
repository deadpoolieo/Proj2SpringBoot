package com.example.springbootproj1.Controller;

import com.example.springbootproj1.controller.UserController;
import com.example.springbootproj1.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    void queryuser(){
        HashMap map = new HashMap();
        map.put("username","张三");
        map.put("password","123456");
        map.put("admin","系统管理员");
        List list = userController.queryuser(map);
        System.out.println(list);
    }
}
