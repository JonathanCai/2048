package me.wslong.spring2048.web;

import javax.servlet.http.HttpSession;

import me.wslong.spring2048.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/user")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/signin", method = RequestMethod.POST)
  public String signin( //
      @RequestParam(defaultValue = "", value = "username") String username, //
      @RequestParam(defaultValue = "", value = "password") String password, //
      HttpSession session) {

    userService.signin(username, password);

    session.setAttribute("username", username);
    return "redirect:/play2048";
  }

  @RequestMapping(value = "/signup", method = RequestMethod.POST)
  public String signup( //
      @RequestParam(defaultValue = "", value = "username") String username, //
      @RequestParam(defaultValue = "", value = "password") String password) {

    return "redirect:/play2048";
  }

}
