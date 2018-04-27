package mn.num.seas.complaint_registration.entity;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_complaint")
public class Complaint
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "complaint_id")
  private long id;
  //
  //  @OneToOne(targetEntity = User.class, optional = false)
  //  @JoinColumn(name = "receiver_id")
  //  private User receiver;
  //
  //  @OneToOne(targetEntity = User.class, optional = false)
  //  @JoinColumn(name = "issuer_id")
  //  private User issuer;

  @OneToMany(mappedBy = "complaint")
  private Collection<Message> messages;

  public Complaint()
  {
    this.messages = new ArrayList<>();
  }

  public static Complaint createWith(Message message)
  {
    Complaint complaint = new Complaint();
    complaint.addMessage(message);
    return complaint;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  //  public User getReceiver()
  //  {
  //    return receiver;
  //  }
  //
  //  public void setReceiver(User receiver)
  //  {
  //    this.receiver = receiver;
  //  }
  //
  //  public User getIssuer()
  //  {
  //    return issuer;
  //  }
  //
  //  public void setIssuer(User issuer)
  //  {
  //    this.issuer = issuer;
  //  }

  public Collection<Message> getMessages()
  {
    return messages;
  }

  public void setMessages(Collection<Message> messages)
  {
    this.messages = messages;
  }

  public void addMessage(Message message)
  {
    this.messages.add(message);
    message.setComplaint(this);
  }
}
