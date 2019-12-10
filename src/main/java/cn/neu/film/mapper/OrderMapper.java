package cn.neu.film.mapper;

import cn.neu.film.pojo.Order;

import java.util.List;

public interface OrderMapper {
    /**
     * 查询所有订单信息
     */
    public List<Order> findAllOrder();

    /**
     * 通过用户名或电影名搜索订单
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
     * 查询订单是否已存在
     */
    List<Order> findOrderByouIdAndomId(int ouId, int omId);

    /**
     * 查询电影订单
     */
    List<Order> findOrderDescribe(int omId);
}
