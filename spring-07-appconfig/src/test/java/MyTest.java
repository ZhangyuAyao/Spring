import com.kuang.config.KuangConfig;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用了配置类方式去做，我们就只能通过 AnnotationConfig 上下文来获取容器，通过配置类的class对象加载！
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KuangConfig.class);
        User getUser = context.getBean("user", User.class);
        System.out.println(getUser.getName());
    }

    @Test
    public void test() {
        ArrayDeque<Integer> integers = new ArrayDeque<>();
        integers.add(null);
    }
}
