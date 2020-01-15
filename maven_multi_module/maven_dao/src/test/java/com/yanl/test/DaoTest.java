package com.yanl.test;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: YanL
 * @Time: 19:47 2020/1/14
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public class DaoTest {
    @Test
    public void testDao() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        IAccountDao accountDao = ac.getBean(IAccountDao.class);
        Account account = accountDao.findById(1);
        System.out.println(account.toString());
    }
}
