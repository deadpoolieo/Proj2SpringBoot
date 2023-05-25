package com.example.springbootproj1.controller;

import com.example.springbootproj1.entity.Idrelateadmin;
import com.example.springbootproj1.entity.User;
import com.example.springbootproj1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping(value = "queryuser")
    public List<Idrelateadmin> queryuser(@RequestBody Map<String,String> map){
        System.out.println(map.get("username")+map.get("password")+map.get("admin"));
        List<Idrelateadmin> listrelate = userService.QueryUser(map.get("username"),map.get("password"),map.get("admin"));
        System.out.println(listrelate);
        return listrelate;
    }
}
