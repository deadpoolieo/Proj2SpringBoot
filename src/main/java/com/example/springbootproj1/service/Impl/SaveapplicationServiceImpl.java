package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Newapplication;
import com.example.springbootproj1.service.SaveapplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootproj1.mapper.saveapplication;

@Service
public class SaveapplicationServiceImpl implements SaveapplicationService {
    @Autowired
    private saveapplication saveapplication;

    @Override
    public void saveapplication(Newapplication newapplication){saveapplication.insert(newapplication);}
}
