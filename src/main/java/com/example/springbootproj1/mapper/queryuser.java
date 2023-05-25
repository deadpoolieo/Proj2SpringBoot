package com.example.springbootproj1.mapper;

import com.example.springbootproj1.entity.Idrelateadmin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface queryuser {
        @Select("<script>select idrelateadmin.id, idrelateadmin.permissionid from idrelateadmin where idrelateadmin.id = (Select user.id from user where user.username = #{username} and user.password = #{password}) and idrelateadmin.permissionid = (Select permission.id from permission where permission.admin = #{admin})</script>")
        List<Idrelateadmin> Queryuserrelatepermission(String username, String password, String admin);
}
