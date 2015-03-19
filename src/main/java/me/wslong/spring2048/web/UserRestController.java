package me.wslong.spring2048.web;

import me.wslong.spring2048.web.dto.RestDTO;
import me.wslong.spring2048.web.dto.UserDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/user")
public class UserRestController {

  @RequestMapping(value = "/get", method = RequestMethod.POST)
  public RestDTO get() {
    UserDTO user = new UserDTO();
    return new RestDTO(true, user);
  }

}
