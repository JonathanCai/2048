package me.wslong.spring2048.web.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {

  private Long uid;

  private String username;

  private Long rank;

  private Long score;

  private Date date;

}
