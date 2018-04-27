package mn.num.seas.complaint_registration.repository;

import mn.num.seas.complaint_registration.entity.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long>
{
}
