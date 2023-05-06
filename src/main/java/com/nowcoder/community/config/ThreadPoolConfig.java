package com.nowcoder.community.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author: kraken
 * @Date: 2021/5/18 14:00
 */
@Configuration
@EnableScheduling
@EnableAsync
public class ThreadPoolConfig {
}
