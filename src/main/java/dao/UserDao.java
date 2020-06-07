package dao;

import models.Auto;
import models.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtils;

import java.util.List;

public class UserDao {

    public User findUserById(int id) {
        return HibernateSessionFactoryUtils.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.save(user);
        transaction1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.update(user);
        transaction1.commit();
        session.close();

    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtils.getSessionFactory().openSession();
        Transaction transaction1 = session.beginTransaction();
        session.delete(user);
        transaction1.commit();
        session.close();

    }

    public Auto findAutoById(int id) {
        return HibernateSessionFactoryUtils.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() {
      List<User> users = (List<User>) HibernateSessionFactoryUtils.getSessionFactory().openSession();
      return users;

    }
}
