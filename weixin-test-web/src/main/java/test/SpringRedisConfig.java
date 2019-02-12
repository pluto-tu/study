package test;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.GenericToStringSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by sampson on 2017/5/17.
 */
@Configuration
@EnableCaching
public class SpringRedisConfig extends CachingConfigurerSupport {

//    @Bean
//    public JedisPoolConfig jedisPoolConfig() {
//        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
//        jedisPoolConfig.setMaxTotal(1000);
//        jedisPoolConfig.setMaxIdle(50);
//        jedisPoolConfig.setMaxWaitMillis(50000);
//        jedisPoolConfig.setTestOnBorrow(true);
//       return jedisPoolConfig;
//    }
//
//
//
//    @Bean
//    public JedisConnectionFactory redisConnectionFactory() {
//        JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
//        redisConnectionFactory.setPoolConfig(jedisPoolConfig());
//        return redisConnectionFactory;
//    }
//
//    @Bean
//    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory cf) {
//        RedisTemplate<String, String> redisTemplate = new RedisTemplate<String, String>();
//        redisTemplate.setConnectionFactory(cf);
//        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
//        redisTemplate.setKeySerializer(new StringRedisSerializer());
//        return redisTemplate;
//    }
//
//    @Bean
//    public RedisTemplate<String, Long> longRedisTemplate() {
//        final RedisTemplate<String, Long> template = new RedisTemplate<String, Long>();
//        template.setConnectionFactory(redisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setHashValueSerializer(new GenericToStringSerializer<Long>(Long.class));
//        template.setValueSerializer(new GenericToStringSerializer<Long>(Long.class));
//        return template;
//    }
//
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(){
//        StringRedisTemplate stringRedisTemplate = new StringRedisTemplate();
//        stringRedisTemplate.setConnectionFactory(redisConnectionFactory());
//        return stringRedisTemplate;
//    }

    @Bean
    public CacheManager cacheManager() {

        RedisTemplate redisTemplate = new RedisTemplate();

        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);

        // 启用前缀后，生成的key会自动加上cache名称，相当于命名空间。最终的缓存key为cachename:key的方式。
        cacheManager.setUsePrefix(true);

        ArrayList<String> cacheNames = new ArrayList<String>();
        cacheNames.add("campInfo");
        cacheNames.add("duplicateRemoval");
        cacheManager.setCacheNames(cacheNames);

        Map<String, Long> cacheExp = new HashMap<String, Long>();
        cacheExp.put("campInfo", new Long(172800));
        cacheExp.put("duplicateRemoval", new Long(60));
        cacheManager.setExpires(cacheExp);

//	    // 设置默认失效时长为7200秒
//	    cacheManager.setDefaultExpiration(7200);

        return cacheManager;
    }





}

