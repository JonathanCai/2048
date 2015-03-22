package spring2048.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring2048.web.dto.UserDTO;

@Controller
public class HomeController {

  @RequestMapping("/")
  String home() {
    return "redirect:/signin";
  }

  @RequestMapping("/signin")
  String signin() {
    return "signin";
  }

  @RequestMapping("/signup")
  String signup() {
    return "signup";
  }

  @RequestMapping("/play2048")
  String play2048(HttpSession session, Model model) {
    UserDTO userDTO = (UserDTO) session.getAttribute("userDTO");
    model.addAttribute("username", userDTO.getUsername());
    return "play2048";
  }

}
