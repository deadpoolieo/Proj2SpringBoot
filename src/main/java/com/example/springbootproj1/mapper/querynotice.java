package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface querynotice {
    @Select("<script>select id,ntcdate,ntctitle,ntcjuyo from notice</script>")
    List<Notice> Querynotice();
}
