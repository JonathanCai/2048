package spring2048.service;

import java.util.Date;
import java.util.List;

import spring2048.web.dto.UserScoreDTO;

public interface ScoreService {

  List<UserScoreDTO> viewPublicScore();

  UserScoreDTO viewMyselfScore(String username);

  Boolean uploadMyScore(Long scoring, Date date, String username);

}
