/**
 * Copyright (C), 2015-2018, 龙盾技术科技有限公司
 * FileName: UserMapper
 * Author:   ASUS
 * Date:     2018/5/7 9:46
 * Description:
 * History:
 * <author>          <e_mail>
 * 孙国锦          getElements@outlook.com
 */
package com.jk.mapper;

import com.jk.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author ASUS
 * @create 2018/5/7
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    List<User> selectUserList();

    @Insert("insert into t_user(uname,age) values(#{uname},#{age})")
    void saveList(@Param("uname") String uname,@Param("age") Integer age);

    @Delete("delete from t_user where uid=#{uid}")
    void removeList(@Param("uid") Integer uid);

}