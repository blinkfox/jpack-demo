package com.blinkfox.jpack.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 本应用的核心启动类.
 *
 * @author blinkfox on 2020-06-22.
 * @since v1.5.0
 */
@SpringBootApplication
public class JpackDemoApplication {

	/**
	 * 主入口方法.
	 *
	 * @param args 数组参数
	 */
	public static void main(String[] args) {
		SpringApplication.run(JpackDemoApplication.class, args);
	}

}
