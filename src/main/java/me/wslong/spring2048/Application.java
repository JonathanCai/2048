package me.wslong.spring2048;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    // SpringApplication.run(CommontaskApplication.class, args);

    SpringApplication app = new SpringApplication(Application.class);
    app.setShowBanner(false);
    app.run(args);
  }

}
