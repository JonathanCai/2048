package me.wslong.spring2048.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
public class ScoreEntity implements Serializable {

  @Id
  @GeneratedValue
  private Long score_id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private Long scoring;

  @Column(nullable = false)
  private Date score_date;

}
