package com.bdqn.simplebook.dao;

import com.bdqn.simplebook.domain.User;

import java.util.List;

/**
 * @author: 赖榕
 * @date: 2019/11/18
 * @description:
 * @version: 1.0
 * @since: JDK1.8
 * @packageName: com.bdqn.simplebook.dao
 */
public interface UserDao {

        int addUser(User user);

        /**
         * 查询首页的所有用户
         * @return
         * @throws Exception
         */
        public List<User> selectIndexUser()throws Exception;



}
