package me.wslong.spring2048.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    model.addAttribute("username", session.getAttribute("username"));
    return "play2048";
  }

}
