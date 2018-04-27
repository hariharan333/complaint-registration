package mn.num.seas.complaint_registration.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "tbl_message")
public class Message
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String content;

  public Message()
  {
  }

  public Message(Complaint complaint)
  {
    this.complaint = complaint;
  }

  @ManyToOne
  @JoinColumn(name = "complaint_id")
  @JsonBackReference
  private Complaint complaint;

  public Message(String content)
  {
    this.content = content;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  public Complaint getComplaint()
  {
    return complaint;
  }

  public void setComplaint(Complaint complaint)
  {
    this.complaint = complaint;
  }

  @Override
  public String toString()
  {
    return "Message{" +
      "id=" + id +
      ", content='" + content + '\'' +
      ", complaint=" + complaint +
      '}';
  }
}
