package me.wslong.spring2048.service;

import me.wslong.spring2048.web.dto.UserDTO;

public interface UserService {

  UserDTO signin(String username, String password);

  UserDTO signup(String username, String password);

}
