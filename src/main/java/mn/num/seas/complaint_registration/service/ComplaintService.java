package mn.num.seas.complaint_registration.service;

import mn.num.seas.complaint_registration.entity.Complaint;
import mn.num.seas.complaint_registration.entity.Message;
import org.springframework.stereotype.Service;

@Service
public interface ComplaintService
{
  Iterable<Complaint> listAll();

  Complaint create(ComplaintRequest request);

  Message addMessage(Long id, String message);
}
