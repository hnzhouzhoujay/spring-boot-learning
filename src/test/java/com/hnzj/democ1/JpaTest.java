package com.hnzj.democ1;

import com.hnzj.democ1.dao.UserRepository;
import com.hnzj.democ1.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 周杰 on 2018/4/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class JpaTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testRepository(){
        userRepository.save(new User("zhoujie",28));
        userRepository.save(new User("wujie",29));
        User user = userRepository.findByName("zhoujie");
        System.out.println(user);

    }

}
