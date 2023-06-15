package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Investmentplan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Saveinvestmentplan {
    @Insert("<script>Insert into investmentplan (aplshinseisyaname,pldonyunendo__c,pldonyujiki__c,plkaigaikounyu__c,plprice__c,plamount__c,pltotalamount__c) values (#{aplshinseisyaname},#{pldonyunendo__c},#{pldonyujiki__c},#{plkaigaikounyu__c},#{plprice__c},#{plamount__c},#{pltotalamount__c})</script>")
    void insertinvestmentplan(Investmentplan investmentplan);
}
