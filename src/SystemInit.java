import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import user.User;
import user.UserFactory;

public class SystemInit {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // spring方式获取对象
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/spring-context.xml");
        User contextUser = context.getBean("User", User.class);
        contextUser.SysOut();
        // 工厂模式获取对象
        User user = UserFactory.getUser();
        user.SysOut();
    }
}
