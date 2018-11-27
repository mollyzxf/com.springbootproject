package service;

import dao.User;

public interface UserService {
    User findUser(String name, String password);
}
