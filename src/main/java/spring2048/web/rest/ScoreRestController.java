package spring2048.web.rest;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring2048.service.ScoreService;
import spring2048.web.dto.RestDTO;
import spring2048.web.dto.UserScoreDTO;

@RestController
@RequestMapping(value = "/rest/score", produces = { "application/json" })
public class ScoreRestController {

  @Autowired
  private ScoreService scoreService;

  @RequestMapping(value = "/getPublic", method = RequestMethod.GET)
  public RestDTO publicScore() {

    List<UserScoreDTO> scoreList = scoreService.viewPublicScore();
    if (scoreList != null) {
      return new RestDTO(true, scoreList);
    } else {
      return new RestDTO(false, "NO_SCORE_FOUND", new Object());
    }

  }

  @RequestMapping(value = "/getMyself", method = RequestMethod.GET)
  public RestDTO myselfScore(HttpSession session) {

    UserScoreDTO loginUser = (UserScoreDTO) session.getAttribute("session_user");
    if (loginUser != null) {
      return new RestDTO(true, scoreService.viewMyselfScore(loginUser.getUsername()));
    } else {
      return new RestDTO(false, "USER_NEED_LOGIN", new Object());
    }

  }
}
