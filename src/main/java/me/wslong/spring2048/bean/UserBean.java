package me.wslong.spring2048.bean;

import java.util.Date;

import lombok.Data;

@Data
public class UserBean {

  private String uid;

  private Long rank;

  private Long score;

  private Date date;

}
