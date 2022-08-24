package com.du;

import redis.clients.jedis.Jedis;

public class TestPing {

    public static void main(String[] args) {
        // 1. new 一个 Jedis 对象即可
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        // 2. 通过Jedis对象来执行Redis的命令
        jedis.set("a", "aa");
        System.out.println(jedis.get("a"));
    }
}
