package me.wslong.spring2048.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@SuppressWarnings("serial")
@Entity
@Data
public class UserEntity implements Serializable {

  @Id
  @GeneratedValue
  private Long user_id;

  @Column(nullable = false)
  private String username;

  @Column(nullable = false)
  private String password;

}
