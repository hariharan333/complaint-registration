package mn.num.seas.complaint_registration.controller;

import mn.num.seas.complaint_registration.entity.User;
import mn.num.seas.complaint_registration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static mn.num.seas.complaint_registration.controller.Constants.JSON;

@org.springframework.web.bind.annotation.RestController
public class UserController
{
  @Autowired
  private UserService userService;

  @RequestMapping(value = "/user", method = RequestMethod.GET)
  public Iterable<User> listUsers()
  {
    return userService.listAll();
  }

  @RequestMapping(value = "/user", method = RequestMethod.PUT, consumes = JSON)
  public User putUser(@RequestBody User user)
  {
    return userService.createOrUpdate(user);
  }

  @RequestMapping(value = "/user", method = RequestMethod.POST)
  public User postUser(@RequestParam String sisiID)
  {
    return userService.createBySisiID(sisiID);
  }
}
