package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Investmentplan;
import com.example.springbootproj1.mapper.Saveinvestmentplan;
import com.example.springbootproj1.service.SaveinvestmentplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveinvestmentplanServiceImpl implements SaveinvestmentplanService {
    @Autowired
    private Saveinvestmentplan saveinvestmentplan;

    @Override
    public void saveinvestmentplan(Investmentplan investmentplan){saveinvestmentplan.insertinvestmentplan(investmentplan);};
}
