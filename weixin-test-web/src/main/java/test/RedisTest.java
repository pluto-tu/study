package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by tubangwu on 2017/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:appcontext-redis.xml"})
public class RedisTest {


    @Autowired
    private RedisTemplate<String, Long> longRedisTemplate;

    @Autowired
    private RedisTemplate<String, String> stringRedisTemplate;

    @Test
    public void add() {
//        boolean result = (boolean) redisTemplate.execute((RedisCallback<Boolean>) connection -> {
//            connection.set("4".getBytes(), "4b".getBytes());
//            return true;
//        });
//        System.out.println(result);

        ValueOperations<String, Long> operations = longRedisTemplate.opsForValue();
        ValueOperations<String, String> operations2 = stringRedisTemplate.opsForValue();
        String key = "tbw123";
        operations2.set(key,"123");
//        Long s = operations.get(key);
//        System.out.println(s);
    }




}
