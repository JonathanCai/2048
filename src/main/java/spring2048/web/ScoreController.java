package spring2048.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring2048.service.ScoreService;
import spring2048.web.dto.RestDTO;
import spring2048.web.dto.UserScoreDTO;

@Controller
@RequestMapping(value = "/score")
public class ScoreController {

  @Autowired
  private ScoreService scoreService;

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public String publicScore(HttpSession session, Model model) {

    UserScoreDTO sessionUser = (UserScoreDTO) session.getAttribute("session_user");
    if (sessionUser == null) {
      return "redirect:/user/signin";
    }
    model.addAttribute("username", sessionUser.getUsername());

    List<UserScoreDTO> scoreList = scoreService.viewPublicScore();
    model.addAttribute("scoreList", scoreList);

    UserScoreDTO myScore = scoreService.viewMyselfScore(sessionUser.getUsername());
    model.addAttribute("myScore", myScore);
    return "score2048";

  }

  @ResponseBody
  @RequestMapping(value = "/upload", method = RequestMethod.POST, produces = { "application/json" })
  public RestDTO uploadScoreREST(HttpSession session, //
      @RequestParam(value = "score", defaultValue = "") String score) {

    UserScoreDTO sessionUser = (UserScoreDTO) session.getAttribute("session_user");
    if (sessionUser != null) {
      Boolean uploadScoreResult = scoreService
          .uploadMyScore(Long.valueOf(score), new Date(), sessionUser.getUsername());
      return new RestDTO(uploadScoreResult, uploadScoreResult ? "" : "ERR_UPLOAD_1", "");
    } else {
      return new RestDTO(false, "ERR_UPLOAD_2", "");
    }

  }

}
