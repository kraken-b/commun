package com.nowcoder.community.util;

import com.nowcoder.community.entity.User;
import org.springframework.stereotype.Component;

/**
 * 持有用户信息，用于代替session对象。
 * @Author: kraken
 * @Date: 2021/4/15 9:39
 */
@Component
public class HostHolder {

    // 以线程为key取得map，存取值
    private ThreadLocal<User> users = new ThreadLocal<>();

    public void setUser(User user) {
        users.set(user);
    }

    public User getUser() {
        return users.get();
    }

    public void clear(){
        users.remove();
    }

}
