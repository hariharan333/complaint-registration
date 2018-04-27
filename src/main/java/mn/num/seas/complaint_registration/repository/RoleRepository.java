package mn.num.seas.complaint_registration.repository;

import mn.num.seas.complaint_registration.entity.wip.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long>
{
  boolean existsByName(String name);
}
