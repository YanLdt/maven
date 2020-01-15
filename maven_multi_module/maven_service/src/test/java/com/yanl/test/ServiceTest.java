package com.yanl.test;

import com.yanl.service.IAccountService;
import com.yanl.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: YanL
 * @Time: 10:05 2020/1/15
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class ServiceTest {
    @Test
    public void testService() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
        IAccountService accountService = ac.getBean("accountService",IAccountService.class);
        accountService.findById(1);
    }

    @Test
    public void testImpl() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
        AccountServiceImpl accountService = ac.getBean("accountService",AccountServiceImpl.class);
        accountService.findById(1);
    }
}
