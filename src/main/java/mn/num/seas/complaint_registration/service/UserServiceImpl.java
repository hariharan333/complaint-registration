package mn.num.seas.complaint_registration.service;

import mn.num.seas.complaint_registration.entity.User;
import mn.num.seas.complaint_registration.repository.RoleRepository;
import mn.num.seas.complaint_registration.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService
{
  @Autowired
  private UserRepository userRepo;

  @Autowired
  private RoleRepository roleRepo;

  @Override
  public User createBySisiID(String sisiID)
  {
    User user = new User(sisiID);
    return userRepo.save(user);
  }

  @Override
  public User createOrUpdate(User user)
  {
    return userRepo.save(user);
  }

  @Override
  public Iterable<User> listAll()
  {
    return userRepo.findAll();
  }
}
