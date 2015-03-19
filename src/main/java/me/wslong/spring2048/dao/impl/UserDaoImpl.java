package me.wslong.spring2048.dao.impl;

import me.wslong.spring2048.dao.UserDao;
import me.wslong.spring2048.entity.UserEntity;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public UserEntity createUser(UserEntity user) {
    return null;
  }

  @Override
  public UserEntity getUserByUsernameByPassword(String username, String password) {
    return null;
  }

}
