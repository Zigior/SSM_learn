package cn.neu.film.service.impl;

import cn.neu.film.mapper.OrderMapper;
import cn.neu.film.pojo.Order;
import cn.neu.film.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Override
    public List<Order> findAllOrder() {
        List<Order> orders = orderMapper.findAllOrder();
        return orders;
    }

    @Override
    public List<Order> findOrderByName(String getmName) {
        List<Order> orders = orderMapper.findOrderByName(getmName);
        return orders;
    }

    @Override
    public int delOrder(int getoId) {
        int i = orderMapper.delOrder(getoId);
        return i;
    }

    @Override
    public int editDescribe(Order order) {
        int i = orderMapper.editDescribe(order);
        return i;
    }

    @Override
    public int addOrder(Order order) {
        int i = orderMapper.addOrder(order);
        return i;
    }

    @Override
    public int updateDescribe(Order order) {
        int i = orderMapper.updateDescribe(order);
        return i;
    }

    @Override
    public int findOrderByouIdAndomId(int ouId, int omId) {
        List<Order> orders = orderMapper.findOrderByouIdAndomId(ouId,omId);
        return orders.size();
    }

    @Override
    public List<Order> findOrderDescribe(int omId) {
        List<Order> orders = orderMapper.findOrderDescribe(omId);
        return orders;
    }
}
