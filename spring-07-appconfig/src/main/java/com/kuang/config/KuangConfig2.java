package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zhang
 * @date: 2022/3/6
 * @description:
 */

//这个也会被Spring容器托管，注册到容器中，因为他本来就是一个@Component，
// @Configuration代表这是一个配置类，就和我们之前看的beans.xml
@Configuration
public class KuangConfig2 {
}
