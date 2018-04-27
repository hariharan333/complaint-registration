package mn.num.seas.complaint_registration.service;

import mn.num.seas.complaint_registration.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService
{
  User createBySisiID(String sisiID);

  User createOrUpdate(User user);

  Iterable<User> listAll();
}
