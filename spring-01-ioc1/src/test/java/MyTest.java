import com.kuang.dao.UserDaoImpl;
import com.kuang.dao.UserDaoMysqlImpl;
import com.kuang.dao.UserDaoOracleImpl;
import com.kuang.service.UserService;
import com.kuang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhang
 * @date: 2022/3/4
 * @description:
 */
public class MyTest {
    public static void main(String[] args) {
        //获取ApplicationContext：拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么，就从容器中拿
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");

        userServiceImpl.getUser();
    }
}
