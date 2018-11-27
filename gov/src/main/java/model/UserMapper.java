package model;

import dao.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {

    User findUser(@Param("name") String name,@Param("password") String password);
}
