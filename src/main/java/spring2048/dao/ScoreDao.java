package spring2048.dao;

import java.util.List;

import spring2048.entity.ScoreEntity;

public interface ScoreDao {

  ScoreEntity createScore(ScoreEntity score);

  ScoreEntity retrieveHighestScoreByUsername(String username);

  List<ScoreEntity> retrieveListScore(Boolean desc);

}
