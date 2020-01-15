package com.yanl.service;

import com.yanl.domain.Account;

/**
 * @Author: YanL
 * @Time: 19:59 2020/1/14
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
public interface IAccountService {
    /**
     * 根据ID查询账户
     * @param id 要查询的ID
     * @return 返回账户
     */
    public Account findById(int id);
}
