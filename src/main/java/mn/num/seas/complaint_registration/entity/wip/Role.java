package mn.num.seas.complaint_registration.entity.wip;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
public class Role
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;

  @OneToMany(targetEntity = Action.class, fetch = FetchType.EAGER)
  private Collection actions;

  public Role()
  {
  }

  public Role(String name)
  {
    this.name = name;
  }

  public Role(Role role)
  {
    this.id = role.id;
    this.name = role.name;
    this.actions = role.actions;
  }

  public long getId()
  {
    return id;
  }

  public void setId(long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }
}
