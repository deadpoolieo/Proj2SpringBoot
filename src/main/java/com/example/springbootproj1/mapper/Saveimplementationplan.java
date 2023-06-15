package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Implementationplan;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Saveimplementationplan {
    @Insert("<script>Insert into implementationplan (aplshinseisyaname,name,pljisshikomokuc,plhyoukakijunc,plhyoukahindoc,pljisshijikinendoc,pljisshijikishihankic) values (#{aplshinseisyaname},#{name},#{pljisshikomokuc},#{plhyoukakijunc},#{plhyoukahindoc},#{pljisshijikinendoc},#{pljisshijikishihankic})</script>")
    void insertimplementationplan(Implementationplan implementationplan);
}
