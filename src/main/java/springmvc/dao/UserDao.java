package springmvc.dao;

import springmvc.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void updateUser(User user);
    User getUserById(Long id);
    void delete(User user);
    List<User> getUsers();
    void deleteAll();
}
