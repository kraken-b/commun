package com.nowcoder.community;

import java.io.IOException;

/**
 * @Author: kraken
 * @Date: 2021/5/19 16:03
 */
public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/work/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.nowcoder.com d:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("1111111");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
