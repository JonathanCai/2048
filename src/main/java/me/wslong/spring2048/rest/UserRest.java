package me.wslong.spring2048.rest;

import me.wslong.spring2048.RestBean;
import me.wslong.spring2048.bean.UserBean;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/user")
public class UserRest {

  @RequestMapping(value = "/get", method = RequestMethod.POST)
  public RestBean get() {
    UserBean user = new UserBean();
    return new RestBean(true, user);
  }

}
