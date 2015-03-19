package me.wslong.spring2048.service.impl;

import me.wslong.spring2048.dao.UserDao;
import me.wslong.spring2048.entity.UserEntity;
import me.wslong.spring2048.service.UserService;
import me.wslong.spring2048.web.dto.UserDTO;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;

  @Override
  public UserDTO signin(String username, String password) {

    return null;
  }

  @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
  @Override
  public UserDTO signup(String username, String password) {

    UserEntity user = new UserEntity();
    user.setUsername(username);
    user.setPassword(DigestUtils.md5Hex(password).substring(0, 20));
    userDao.createUser(user);
    return null;
  }

}
