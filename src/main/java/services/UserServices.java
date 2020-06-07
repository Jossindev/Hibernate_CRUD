package services;

import dao.UserDao;
import models.Auto;
import models.User;

import java.util.List;

public class UserServices {

    private UserDao userDao = new UserDao();

    public UserServices () {}

    public User findUser(int id) {
        return userDao.findUserById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }

}
