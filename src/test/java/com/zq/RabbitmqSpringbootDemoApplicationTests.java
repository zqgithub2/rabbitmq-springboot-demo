package com.zq;

import com.zq.provider.MyProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sun.management.counter.perf.PerfInstrumentation;

import java.util.PrimitiveIterator;

@SpringBootTest
class RabbitmqSpringbootDemoApplicationTests {

	@Autowired
	private MyProvider myProvider;

	@Test
	void contextLoads() {
		myProvider.send();
	}

}
