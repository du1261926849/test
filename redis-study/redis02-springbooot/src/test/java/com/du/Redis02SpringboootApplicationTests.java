package com.du;

import com.du.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis02SpringboootApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        User user = new User("du", 3);

        redisTemplate.opsForValue().set("a", user);
        redisTemplate.opsForValue().set("b", "user");
        System.out.println(redisTemplate.opsForValue().get("a"));
        System.out.println(redisTemplate.opsForValue().get("b"));
    }
}
