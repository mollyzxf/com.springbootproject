package service;

import dao.User;
import model.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User findUser(String name, String password) {
        User user = userMapper.findUser(name,password);
        return user;
    }
}
