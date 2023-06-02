package com.example.springbootproj1.service.Impl;

import com.example.springbootproj1.entity.Notice;
import com.example.springbootproj1.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootproj1.mapper.querynotice;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private querynotice querynotice;

    @Override
    public List<Notice> QueryNotice(){return querynotice.Querynotice();}
}
