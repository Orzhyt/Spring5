import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.Human;
import user.Student;
import user.User;
import user.UserFactory;

public class SystemInit {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // spring方式获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-context.xml");
        Human human = context.getBean("user", User.class);
        Human human1 = new Student();
        human1.setAge(3);
        human1.setName("derew");
        human1.sysOut();
    }
}
