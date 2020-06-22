package com.blinkfox.jpack.demo;

import java.util.Random;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * {@link JpackDemoApplication} 单元测试.
 *
 * @author blinkfox on 2020-06-22.
 * @since v1.5.0
 */
@SpringBootTest
class JpackDemoApplicationTests {

	/**
	 * 一个恒为真的测试用例，用来测试 SpringBoot 能否正常启动.
	 */
	@Test
	void contextLoads() {
		Assertions.assertTrue(new Random().nextInt(1) < 2);
	}

}
