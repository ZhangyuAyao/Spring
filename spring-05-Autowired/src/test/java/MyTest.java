import com.kuang.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */
public class MyTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        People people = context.getBean("people", People.class);
        people.getDog().show();
        people.getCat().show();

    }
}
