/**
 * Copyright (C), 2015-2018, 龙盾技术科技有限公司
 * FileName: UserServiceImpl
 * Author:   ASUS
 * Date:     2018/5/7 9:33
 * Description:
 * History:
 * <author>          <e_mail>
 * 孙国锦          getElements@outlook.com
 */
package com.jk.service.impl;

import com.jk.bean.User;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ASUS
 * @create 2018/5/7
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectList() {
        return userMapper.selectUserList();
    }

    @Override
    public void saveList(User user) {
        String uname = user.getUname();
        Integer age = user.getAge();
        userMapper.saveList(uname,age);
    }

    @Override
    public void removeList(Integer uid) {
        userMapper.removeList(uid);
    }
}