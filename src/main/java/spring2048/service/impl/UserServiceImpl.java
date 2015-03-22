package spring2048.service.impl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import spring2048.dao.UserDao;
import spring2048.entity.UserEntity;
import spring2048.service.UserService;
import spring2048.web.dto.UserDTO;

@Transactional(readOnly = true)
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserDao userDao;
  
  @Override
  public UserDTO signin(String username, String password) {
    UserDTO userDTO = null;
    UserEntity checking = userDao.retrieveUserByUsername(username);
    if (checking != null) {
      UserEntity existing = userDao.retrieveUserByUsernameByPassword(username,
          DigestUtils.md5Hex(password).substring(0, 20));
      if (existing != null) {
        userDTO = new UserDTO();
        userDTO.setUid(existing.getUser_id());
        userDTO.setUsername(username);
      }
    }
    return userDTO;
  }

  @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
  @Override
  public UserDTO signup(String username, String password) {
    UserDTO userDTO = null;
    UserEntity user = new UserEntity();
    user.setUsername(username);
    user.setPassword(DigestUtils.md5Hex(password).substring(0, 20));
    userDao.createUser(user);
    if (user.getUser_id() != null && user.getUser_id() > 0) {
      userDTO = new UserDTO();
      userDTO.setUid(user.getUser_id());
      userDTO.setUsername(user.getUsername());
    }
    return userDTO;
  }

}
