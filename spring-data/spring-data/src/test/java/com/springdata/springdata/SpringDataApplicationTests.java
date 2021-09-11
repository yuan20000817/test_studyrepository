package com.springdata.springdata;

import com.springdata.springdata.Repository.UserRepository;
import com.springdata.springdata.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDataApplicationTests {
    @Autowired
    UserRepository userRepository;

    @Test
    void contextLoads() {
        //添加测试数据
        User user = new User();
        user.setUserId("1111");
        user.setPassword("first-pass");
        user.setUsername("test-data-jpa");
        userRepository.save(user);
        //开始进行测试
        System.out.println(userRepository.findByUsername("test-data-jpa").size());
    }

}
