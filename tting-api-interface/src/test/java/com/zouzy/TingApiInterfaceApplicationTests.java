package com.zouzy;

import com.zouzy.sdk.client.TtingApiClient;
import com.zouzy.sdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TingApiInterfaceApplicationTests {

    @Resource
    private TtingApiClient ttingApiClient;

    @Test
    void contextLoads() {
        String result = ttingApiClient.getNameByGet("yupi");
        User user = new User();
        user.setUsername("作_者 【程序员_鱼皮】 https://space.bilibili.com/12890453/");
        String usernameByPost = ttingApiClient.getUsernameByPost(user);
        System.out.println(result);
        System.out.println(usernameByPost);
    }

}
