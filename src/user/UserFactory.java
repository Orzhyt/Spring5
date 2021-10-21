package user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserFactory {
    public static User getUser() {
        return new User();
    }
}
