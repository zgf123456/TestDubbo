package com.zgf.dubbo.consumer;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Reference;
import com.zgf.dubbo.core.model.Person;
import com.zgf.dubbo.core.service.IPersonServcie;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by zgf on 17/3/31.
 */

@Component
public class ConsumerMain {

    @Reference(version = "1.0.0")
    private IPersonServcie personServcie;

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");
        context.start();

        ConsumerMain consumerMain = (ConsumerMain) context.getBean("consumerMain"); // 获取远程服务代理
        Person person = consumerMain.personServcie.getPersonInfo("1");// 执行远程方法
        System.out.println(">>>>>" + JSON.json(person));
    }
}
