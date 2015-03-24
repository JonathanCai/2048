package spring2048.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class RestDTO {

  @NonNull
  private Boolean success;

  private String errorMessage = "";

  @NonNull
  private Object result;

}
