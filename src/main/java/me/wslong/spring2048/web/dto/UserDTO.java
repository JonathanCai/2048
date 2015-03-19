package me.wslong.spring2048.web.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UserDTO {

  private String uid;

  private Long rank;

  private Long score;

  private Date date;

}
