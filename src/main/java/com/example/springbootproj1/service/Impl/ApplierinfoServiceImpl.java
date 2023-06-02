package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Applierinfo;
import com.example.springbootproj1.mapper.queryapplierinfo;
import com.example.springbootproj1.service.ApplierinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplierinfoServiceImpl implements ApplierinfoService {
    @Autowired
    private queryapplierinfo queryapplierinfo;

    @Override
    public List<Applierinfo> QueryApplierinfo(){
        return queryapplierinfo.Queryapplierinfo();
    }
}
