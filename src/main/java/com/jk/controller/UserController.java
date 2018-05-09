/**
 * Copyright (C), 2015-2018, 龙盾技术科技有限公司
 * FileName: UserController
 * Author:   ASUS
 * Date:     2018/5/7 9:32
 * Description: 用户控制层
 * History:
 * <author>          <e_mail>
 * 孙国锦          getElements@outlook.com
 */
package com.jk.controller;

import com.jk.bean.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户控制层〉
 *
 * @author ASUS
 * @create 2018/5/7
 * @since 1.0.0
 */
@RequestMapping(value="userController")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="selectList")
    public String selectList(HttpServletRequest request){
        String callbackparam = request.getParameter("callbackparam");
        List<User> ulist = new ArrayList<User>();
        ulist = userService.selectList();
        callbackparam=callbackparam+"([";
        String aa="";
        for (User user : ulist){
            aa+=",{uname:'"+user.getUname()+"',uid:'"+user.getUid()+"',age:'"+user.getAge()+"'}";
            System.out.println(user.getUname());
        }
        aa=aa.substring(1);
        callbackparam= callbackparam+aa+"])";
        return callbackparam;
    }


    @RequestMapping(value="saveList")
    public void saveList(User user){
        userService.saveList(user);

    }

    @RequestMapping(value="removeList")
    public  void removeList(Integer uid){
        userService.removeList(uid);
    }



}