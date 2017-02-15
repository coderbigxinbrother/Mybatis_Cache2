package com.yc.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class TestProcedure {
    @Test
    public void testRedisConnect() {
    	 Jedis jedis = new Jedis("192.168.1.102",6380);
    	 System.out.println(jedis.ping());
    }

}
