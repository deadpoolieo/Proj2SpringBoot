package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Newapplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface saveapplication {
    @Insert("<script>Insert into applicationpersonalinfo (now,aplshinseisyaname,apladdressyubinno3,apladdressyubinno4,apladdresstodofuken,apladdressshikuchoson,apladdressbanchi,apladdresstodofukenkana,apladdressshikuchosonkana,apladdressbanchikana,apladdressmanshon,apldaihyoshayakushoku,apldaihyoshaname,aplhojinno,apltantoshaname,aplcstel,aplcsfax,aplcstantoshamail) values (#{now},#{aplshinseisyaname},#{apladdressyubinno3},#{apladdressyubinno4},#{apladdresstodofuken},#{apladdressshikuchoson},#{apladdressbanchi},#{apladdresstodofukenkana},#{apladdressshikuchosonkana},#{apladdressbanchikana},#{apladdressmanshon},#{apldaihyoshayakushoku},#{apldaihyoshaname},#{aplhojinno},#{apltantoshaname},#{aplcstel},#{aplcsfax},#{aplcstantoshamail})</script>")
    void insert(Newapplication newapplication);
}
