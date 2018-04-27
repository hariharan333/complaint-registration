package mn.num.seas.complaint_registration.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_user")
public class User
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  @JoinColumn(name = "user_sisi_id")
  private String sisiID;

  private String firstName;
  private String lastName;
  private String sex;
  private String register;
  private Date birthDate;

  public User(String sisiID)
  {
    this.sisiID = sisiID;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getSisiID()
  {
    return sisiID;
  }

  public void setSisiID(String sisiID)
  {
    this.sisiID = sisiID;
  }

  public String getFirstName()
  {
    return firstName;
  }

  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setLastName(String lastName)
  {
    this.lastName = lastName;
  }

  public String getSex()
  {
    return sex;
  }

  public void setSex(String sex)
  {
    this.sex = sex;
  }

  public String getRegister()
  {
    return register;
  }

  public void setRegister(String register)
  {
    this.register = register;
  }

  public Date getBirthDate()
  {
    return birthDate;
  }

  public void setBirthDate(Date birthDate)
  {
    this.birthDate = birthDate;
  }

  @Override
  public String toString()
  {
    return "User{" +
      "id=" + id +
      ", sisiID='" + sisiID + '\'' +
      ", firstName='" + firstName + '\'' +
      ", lastName='" + lastName + '\'' +
      ", sex='" + sex + '\'' +
      ", register='" + register + '\'' +
      ", birthDate=" + birthDate +
      '}';
  }
}
