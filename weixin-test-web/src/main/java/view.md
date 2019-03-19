jvm 内存模型
程序计数器 java虚拟机栈 本地方法栈 方法区 推
堆  -xmx -xmx 分为新生代 老年代 在细致 eden from survivor to survivor
jdk8后  Metaspace 替换 PermGen space （永久代）  不过元空间与永久代之间最大的区别在于：元空间并不在虚拟机中，而是使用本地内存

为什么JDK 8 中永久代向元空间的转换
    1.字符串存在永久代中，容易出现性能问题和内存溢出。
　　 2.类及方法的信息等比较难确定其大小，因此对于永久代的大小指定比较困难，太小容易出现永久代溢出，太大则容易导致老年代溢出。
　　 3.永久代会为 GC 带来不必要的复杂度，并且回收效率偏低。

文档 https://www.cnblogs.com/paddix/p/5309550.html


1、做完自我介绍后，问我会不会微服务，看我简历上没写关于微服务、SOA之类；

2、redis中怎么批量获取key的value值
        //Set<String> keys = redisTemplate.keys("*");
        List<String> list = redisTemplate.opsForValue().multiGet(keys);

3、java8 垃圾收集有什么新特性
 Metaspace 替换 PermGen space （永久代）

4、mysql索引模型 
  在MySQL中，索引属于存储引擎级别的概念，不同存储引擎对索引的实现方式是不同的，MyISAM和InnoDB两个存储引擎。
  

5、threadlocal为什么能做到线程间独立，只要讲出它把数据存在哪里
  从上面的结构图，我们已经窥见ThreadLocal的核心机制：

  每个Thread线程内部都有一个Map。
  Map里面存储线程本地对象（key）和线程的变量副本（value）
  但是，Thread内部的Map是由ThreadLocal维护的，由ThreadLocal负责向map获取和设置线程的变量值。

  所以对于不同的线程，每次获取副本值时，别的线程并不能获取到当前线程的副本值，形成了副本的隔离，互不干扰。


  https://www.jianshu.com/p/98b68c97df9b

6、elasticsearch的组成

7、一个算法题，一个数组里面有正数、负数 量大概1000万吧，找出子集之和最大的序列出来

8、假设让你来设计线程池，怎么设计，考虑哪些事情





第二个人

问如何设计一个日志收集系统。

答1、使用 rpc 将日志内容发给mq； 2、mq写入es； 3、前台页面通过es查询日志内容。

问redis 为什么那么快？

答1、内部是 多路复用器； 2、基于 内存 存储； 3、单线程。

问mq 如何保证消息不丢？

答我说的 rabbitmq 1、生产者：开启 confirm 模式； 2、rabbitmq：deliveryMode 设置为 2； 3、消费者：手动 ack。

问解决过的，最有成就感的问题。

答我忘了怎么回答的了。

问jvm垃圾回收器说一下。

mysql 索引

单链表快排

 
