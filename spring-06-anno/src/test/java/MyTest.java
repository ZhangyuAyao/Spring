import com.kuang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.name);
    }
}
