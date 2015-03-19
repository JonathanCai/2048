package me.wslong.spring2048.dao;

import me.wslong.spring2048.entity.UserEntity;

public interface UserDao {

  UserEntity createUser(UserEntity user);

  UserEntity getUserByUsernameByPassword(String username, String password);

}
