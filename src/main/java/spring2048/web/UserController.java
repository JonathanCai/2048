package spring2048.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring2048.service.UserService;
import spring2048.web.dto.UserDTO;

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

    UserDTO userDTO = userService.signin(username, password);
    if (userDTO != null) {
      session.setAttribute("userDTO", userDTO);
      return "redirect:/play2048";
    }

    return "redirect:/signin";
  }

  @RequestMapping(value = "/signup", method = RequestMethod.POST)
  public String signup( //
      @RequestParam(defaultValue = "", value = "username") String username, //
      @RequestParam(defaultValue = "", value = "password") String password) {

    UserDTO userDTO = userService.signup(username, password);
    System.out.println(userDTO.getUid());
    System.out.println(userDTO.getUsername());

    return "redirect:/play2048";
  }

}
