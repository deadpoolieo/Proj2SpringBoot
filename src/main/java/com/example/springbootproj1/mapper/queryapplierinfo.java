package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Applierinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface queryapplierinfo {
    @Select("<script>select * from applierinfo</script>")
    List<Applierinfo> Queryapplierinfo();
}
