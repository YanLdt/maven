package com.yanl.service.impl;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: YanL
 * @Time: 9:46 2020/1/15
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    public Account findById(int id) {
        Account account = accountDao.findById(id);
        System.out.println(account.toString());
        return account;
    }
}
