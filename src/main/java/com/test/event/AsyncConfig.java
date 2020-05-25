package com.test.event;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *  注解 @EnableAsync表明启用异步方法执行功能
 */
@Configuration
@EnableAsync
public class AsyncConfig {

}
