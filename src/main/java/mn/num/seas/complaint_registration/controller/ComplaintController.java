package mn.num.seas.complaint_registration.controller;

import mn.num.seas.complaint_registration.entity.Complaint;
import mn.num.seas.complaint_registration.entity.Message;
import mn.num.seas.complaint_registration.service.ComplaintRequest;
import mn.num.seas.complaint_registration.service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static mn.num.seas.complaint_registration.controller.Constants.JSON;

@RestController
public class ComplaintController
{
  @Autowired
  private ComplaintService complaintService;

  @RequestMapping(value = "/complaint", method = RequestMethod.GET)
  public Iterable<Complaint> listComplaints()
  {
    return complaintService.listAll();
  }

  @RequestMapping(value = "/complaint", method = RequestMethod.POST, consumes = JSON)
  public Complaint createComplaint(@RequestBody ComplaintRequest complaintRequest)
  {
    return complaintService.create(complaintRequest);
  }

  @RequestMapping(value = "/complaint/{id}", method = RequestMethod.PUT, consumes = "text/plain")
  public Message putMessage(@PathVariable long id, @RequestBody String message)
  {
    return complaintService.addMessage(id, message);
  }
}
