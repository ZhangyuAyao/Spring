import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhang
 * @date: 2022/3/7
 * @description:
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //注意点：动态代理代理的是接口UseService，而不是具体的实现类UserServiceImpl
        // （因为底层是使用代理来完成的，这里相当于bean自动生成了一个代理类，该代理类实现了UserService，所以这里只能是UseService，不能是UserServiceImpl）
        UserService userService = context.getBean("userService", UserService.class);

        userService.delete();


    }
}
