package cn.neu.film.service;

import cn.neu.film.pojo.Order;

import java.util.List;

public interface OrderService {
    /**
     * 查询所有订单信息
     */
    public List<Order> findAllOrder();

    /**
     * 用用户名或电影名搜索订单
     */
    List<Order> findOrderByName(String getmName);

    /**
     * 删除订单
     */
    int delOrder(int getoId);

    /**
     * 编辑评论
     */
    int editDescribe(Order order);

    /**
     * 添加订单
     */
    int addOrder(Order order);

    /**
     * 更新评论
     */
    int updateDescribe(Order order);

    /**
     * 通过电影用户id查订单
     */
    int findOrderByouIdAndomId(int ouId, int omId);

    /**
     * 查询电影订单
     */
    List<Order> findOrderDescribe(int omId);
}
