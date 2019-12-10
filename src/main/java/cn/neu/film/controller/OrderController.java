package cn.neu.film.controller;

import cn.neu.film.pojo.Order;
import cn.neu.film.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class OrderController {
    @Autowired
    OrderService orderService;
    //查询订单列表
    @RequestMapping("/OrderList")
    public List<Order> orderList() throws Exception{
        List<Order> orders = orderService.findAllOrder();
        return orders;
    }
    //通过用户名或电影名搜索订单
    @RequestMapping("/OrderListByName")
    public List<Order> OrderListByName(@RequestBody Order order) throws Exception{
        System.out.println(order);
        List<Order> orders = orderService.findOrderByName(order.getoDescribe());
        return orders;
    }
    //删除订单
    @RequestMapping("/deleteOrder")
    public String deleteOrder(@RequestBody Order order) throws Exception{
        int i = orderService.delOrder(order.getoId());
        if(i==1){
            return "success";
        }else {
            return "fail";
        }
    }
    //编辑评论
    @RequestMapping("/editDescribe")
    public String editDescribe(@RequestBody Order order) throws Exception{
        int i = orderService.editDescribe(order);
        if(i==1){
            return "success";
        }else {
            return "fail";
        }
    }
    //新增订单
    @RequestMapping("/addOrder")
    public String addOrder(@RequestBody Order order) throws Exception{
        int a = orderService.findOrderByouIdAndomId(order.getOuId(),order.getOmId());
        if(a!=0){
            return "already have";
        }else {
        System.out.print(order.getOmId());
            int i = orderService.addOrder(order);
            if (i == 1) {
                return "success";
            } else {
                return "fail";
            }
        }
    }

    //添加评论
    @RequestMapping("/updateDescribe")
    public String updateDescribe(@RequestBody Order order) throws Exception{

            int i = orderService.updateDescribe(order);
            if(i==1){
                return "success";
            }else {
                return "fail";
            }
    }

    //查询电影订单
    @RequestMapping("/findOrderDescribe")
    public List<Order> findOrderDescribe(@RequestBody Order order) throws Exception{
        List<Order> orders = orderService.findOrderDescribe(order.getOmId());
        return orders;
    }
}
