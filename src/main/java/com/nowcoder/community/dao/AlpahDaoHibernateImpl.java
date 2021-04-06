package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: kraken
 * @Date: 2021/3/30 11:00
 */
@Repository("alphaHibernate")
public class AlpahDaoHibernateImpl implements AlphaDao {
    @Override
    public String select() {
        return "Hibernate";
    }
}
