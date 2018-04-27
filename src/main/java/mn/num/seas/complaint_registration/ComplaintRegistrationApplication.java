package mn.num.seas.complaint_registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories
public class ComplaintRegistrationApplication
{

  public static void main(String[] args)
  {
    SpringApplication.run(ComplaintRegistrationApplication.class, args);
  }
}
