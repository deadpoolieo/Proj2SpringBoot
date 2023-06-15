package com.example.springbootproj1.controller;

import com.example.springbootproj1.entity.*;
import com.example.springbootproj1.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    @Autowired
    SaveapplicationService saveapplicationService;
    @Autowired
    SaveinvestmentplanService saveinvestmentplanService;
    @Autowired
    SaveimplementationplanService saveimplementationplanService;

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
    @PostMapping(value = "addapplication")
    public ResponseEntity<?> addapplication(@RequestBody Newapplication newapplication){
        saveapplicationService.saveapplication(newapplication);
        return ResponseEntity.ok("保存に成功しました");
    }
    @PostMapping(value = "addimplementationplan")
    public ResponseEntity<?> addimplementationplan(@RequestBody Implementationplan implementationplan){
        saveimplementationplanService.saveimplementationplan(implementationplan);
        return  ResponseEntity.ok("保存に成功しました");
    }
    @PostMapping(value = "addinvestmentplan")
    public ResponseEntity<?> addinvestmentplan(@RequestBody Investmentplan investmentplan){
        saveinvestmentplanService.saveinvestmentplan(investmentplan);
        return  ResponseEntity.ok("保存に成功しました");
    }
}
