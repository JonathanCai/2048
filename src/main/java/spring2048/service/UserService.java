package spring2048.service;

import spring2048.web.dto.UserDTO;

public interface UserService {

  UserDTO signin(String username, String password);

  UserDTO signup(String username, String password);

}
