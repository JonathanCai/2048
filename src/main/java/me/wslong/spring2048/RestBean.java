package me.wslong.spring2048;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class RestBean {
  @NonNull
  private Boolean success;

  private String errorMessage = "";

  @NonNull
  private Object result;
}
