package me.wslong.spring2048.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@SuppressWarnings("serial")
@Entity(name = "score")
@Data
public class ScoreEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "score_id")
  private Long score_id;

  @Column(name = "username", length = 20, nullable = false)
  private String username;

  @Column(name = "scoring", nullable = false)
  private Long scoring;

  @Column(name = "score_date", nullable = false)
  private Date score_date;

}
