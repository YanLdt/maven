package com.yanl.dao;

import com.yanl.domain.Account;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: YanL
 * @Time: 19:20 2020/1/14
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */

public interface IAccountDao {
    /**
     * 根据ID查找账户
     * @param id 要查找的账户ID
     * @return 返回账号
     */
    @Select("select * from account where id= #{id}")
    public Account findById(int id);
}
