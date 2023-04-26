package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(long id);
    void addUser(User newUser);
    void editUser(User editUser);
    void deleteUser(User deleteUser);
}
