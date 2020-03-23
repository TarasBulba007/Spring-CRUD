package springmvc.service;

import springmvc.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void updateUser(User user);
    User getUserById(Long id);
    void delete(User user);
    List<User> getUsers();
    void deleteAll();
}
