package spring2048.web;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import spring2048.service.UserService;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

  @Mock
  private UserService userService;

}
