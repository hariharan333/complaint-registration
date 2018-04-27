package mn.num.seas.complaint_registration.repository;

import mn.num.seas.complaint_registration.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
}
