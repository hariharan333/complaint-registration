package mn.num.seas.complaint_registration.service;

import java.io.Serializable;

public class ComplaintRequest implements Serializable
{
  private String content;

  public ComplaintRequest()
  {
  }

  public ComplaintRequest(String content)
  {
    this.content = content;
  }

  public String getContent()
  {
    return content;
  }

  public void setContent(String content)
  {
    this.content = content;
  }

  @Override
  public String toString()
  {
    return super.toString();
  }
}
