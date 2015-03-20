package me.wslong.spring2048.dao;

import me.wslong.spring2048.entity.UserEntity;

public interface UserDao {

  UserEntity createUser(UserEntity user);
  
  UserEntity retrieveUserByUsername(String username);

  UserEntity retrieveUserByUsernameByPassword(String username, String password);

}
