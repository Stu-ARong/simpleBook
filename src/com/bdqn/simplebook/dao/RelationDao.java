package com.bdqn.simplebook.dao;

import com.bdqn.simplebook.domain.User;

/**
 * @author: 赖榕
 * @date: 2019/11/18
 * @description:
 * @version: 1.0
 * @since: JDK1.8
 * @packageName: com.bdqn.simplebook.dao
 */
public interface RelationDao {
    int delRelationByUid(User user);

    int delcRelationByCid(User user);

    /**
     * 粉丝数
     * @param user
     * @return
     */
    int queryRelationUid(User user);

    /**
     * 关注人数
     * @param user
     * @return
     */
    int queryRelationCid(User user);
}
