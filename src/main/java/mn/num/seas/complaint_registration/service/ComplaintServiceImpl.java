package mn.num.seas.complaint_registration.service;

import java.util.Optional;

import mn.num.seas.complaint_registration.entity.Complaint;
import mn.num.seas.complaint_registration.entity.Message;
import mn.num.seas.complaint_registration.repository.ComplaintRepository;
import mn.num.seas.complaint_registration.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplaintServiceImpl implements ComplaintService
{
  @Autowired
  private ComplaintRepository complaintRepo;

  @Autowired
  private MessageRepository messageRepo;

  @Override
  public Iterable<Complaint> listAll()
  {
    return complaintRepo.findAll();
  }

  @Override
  public Complaint create(ComplaintRequest request)
  {
    Message message = createComplaintMessage(request.getContent());
    messageRepo.save(message);

    Complaint newComplaint = Complaint.createWith(message);
    return complaintRepo.save(newComplaint);
  }

  @Override
  public Message addMessage(Long id, String msgContent)
  {
    Optional<Complaint> complaint = complaintRepo.findById(id);
    Complaint existingComplaint = complaint.orElseThrow(IllegalArgumentException::new);

    Message message = new Message(msgContent);
    existingComplaint.addMessage(message);

    messageRepo.save(message);
    complaintRepo.save(existingComplaint);

    return message;
  }

  private static Message createComplaintMessage(String content)
  {
    return new Message(content);
  }
}
