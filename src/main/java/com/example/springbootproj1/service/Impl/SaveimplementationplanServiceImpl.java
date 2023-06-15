package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Implementationplan;
import com.example.springbootproj1.mapper.Saveimplementationplan;
import com.example.springbootproj1.service.SaveimplementationplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveimplementationplanServiceImpl implements SaveimplementationplanService {
    @Autowired
    private Saveimplementationplan saveimplementationplan;

    @Override
    public void saveimplementationplan(Implementationplan implementationplan){saveimplementationplan.insertimplementationplan(implementationplan);};
}
