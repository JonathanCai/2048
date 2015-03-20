package spring2048.dao;

import spring2048.entity.UserEntity;

public interface UserDao {

  UserEntity createUser(UserEntity user);
  
  UserEntity retrieveUserByUsername(String username);

  UserEntity retrieveUserByUsernameByPassword(String username, String password);

}
