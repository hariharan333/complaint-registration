package mn.num.seas.complaint_registration.repository;

import mn.num.seas.complaint_registration.entity.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintRepository extends CrudRepository<Complaint, Long>
{
}
