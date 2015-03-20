package spring2048.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring2048.web.dto.RestDTO;
import spring2048.web.dto.UserDTO;

@RestController
@RequestMapping(value = "/rest/user")
public class UserRestController {

  @RequestMapping(value = "/get", method = RequestMethod.POST)
  public RestDTO get() {
    UserDTO user = new UserDTO();
    return new RestDTO(true, user);
  }

}
