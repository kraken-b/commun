package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author: kraken
 * @Date: 2021/4/2 10:16
 */
@Mapper
public interface DiscussPostMapper {

    /**
     * 查询用户发布的信息
     * @param userId 用户个人主页功能，我发布的帖子   动态sql
     * @param offset 每页起始行行号
     * @param limit  每页最多显示多少条数据
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * @Param注解用于给参数取别名
     * 如果只有一个参数，并且在<if>里使用，则必须加别名
     * 查询帖子的行数
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);



}
