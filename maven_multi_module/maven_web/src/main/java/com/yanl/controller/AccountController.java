package com.yanl.controller;

import com.yanl.dao.IAccountDao;
import com.yanl.domain.Account;
import com.yanl.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: YanL
 * @Time: 11:19 2020/1/15
 * @Email: imyanl.dt@gmail.com
 * @Description:
 */
@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    /**
     * 根据ID查询
     * @param model 存放查询得到数据
     * @return 返回success页面
     */
    @RequestMapping("/findById")
    public String findById(Model model){

        Account account = accountService.findById(1);
        model.addAttribute("account", account);
        return "success";
    }
}
