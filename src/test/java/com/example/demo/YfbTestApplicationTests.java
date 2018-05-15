package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

public class YfbTestApplicationTests {
	private ThreadLocal<Object> local = new ThreadLocal<>(); 
	@Test
	public void test02() {
	}
	@Before
	public void set01() {
		local.set("111");
	}
	@Test
	public void test01() {
		System.out.println(local.get());
	}
	@Test
	public void contextLoads() {
		 
		 List<String> list = new ArrayList<String>();
		 list.add("1");
		 list.add("2");
		 list.add("3");
		 list.add("4");
		 list.add("5");
		 list.add("6");
         list.parallelStream().forEachOrdered((wesber) -> {
             System.out.println(wesber+"哈哈哈");
         });
	}


}
