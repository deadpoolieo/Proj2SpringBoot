package com.example.springbootproj1.controller;

import com.example.springbootproj1.entity.Applierinfo;
import com.example.springbootproj1.entity.Idrelateadmin;
import com.example.springbootproj1.entity.Notice;
import com.example.springbootproj1.entity.User;
import com.example.springbootproj1.service.ApplierinfoService;
import com.example.springbootproj1.service.NoticeService;
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
    @Autowired
    ApplierinfoService applierinfoService;
    @Autowired
    NoticeService noticeService;

    @PostMapping(value = "queryuser")
    public List<Idrelateadmin> queryuser(@RequestBody Map<String,String> map){
        List<Idrelateadmin> listrelate = userService.QueryUser(map.get("username"),map.get("password"),map.get("admin"));
        return listrelate;
    }

    @PostMapping(value = "queryapplierinfo")
    public List<Applierinfo> queryapplierinfo(){
        List<Applierinfo> listapplierinfo = applierinfoService.QueryApplierinfo();
        return listapplierinfo;
    }

    @PostMapping(value = "querynoticeinfo")
    public List<Notice> querynoticeinfo(){
        List<Notice> listnoticeinfo = noticeService.QueryNotice();
        return listnoticeinfo;
    }
}
