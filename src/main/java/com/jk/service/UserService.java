/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserService
 * Author:   ASUS
 * Date:     2018/5/7 9:32
 * Description:
 * History:
 * <author>          <e_mail>
 * 孙国进             getElements@outlook.com
 */
package com.jk.service;

import com.jk.bean.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ASUS
 * @create 2018/5/7
 * @since 1.0.0
 */
public interface UserService {

    List<User> selectList();

    void saveList(User user);

    void removeList(Integer uid);

}