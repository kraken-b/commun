package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import com.nowcoder.community.util.SensitiveWordUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: kraken
 * @Date: 2021/4/19 21:55
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter() {
        String text = "这里可以赌博，可以嫖娼，可以吸毒，可以开票,哈哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);

        text = "这里可以赌博，可以~嫖娼~，可以~吸毒~，可以开票,哈哈哈哈！";
        text = sensitiveFilter.filter(text);
        System.out.println(text);
    }

}
