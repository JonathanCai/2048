package spring2048.service;

import spring2048.web.dto.UserScoreDTO;

public interface UserService {

  UserScoreDTO signin(String username, String password);

  UserScoreDTO signup(String username, String password);
  
  Boolean checkUsernameUnique(String username);

}
