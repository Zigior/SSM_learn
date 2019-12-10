package cn.neu.film.service;

import cn.neu.film.pojo.User;
import cn.neu.film.pojo.UserState;

import java.util.List;

public interface UserService {

    /**
     * 注册
     */
    int addUser(User user);

    /**
     * 登录功能
     */
    String checkLogin(String uNameOruMail);
    /**
     * 查询所有用户
     */
    List<User> findAllUser();

    /**
     * 通过用户名或邮箱查用户
     */
    List<User> findUserByuNameOruMail(String getuName);

    /**
     * 删除(注销)用户
     */
    int deleteUser(int getuId);

    /**
     * 查询权限
     */
    List<UserState> findUserState();

    /**
     * 更新用户
     */
    int updateUser(User user);

    /**
     * 通过用户名查询用户信息
     */
    User findUserByName(String getuName);
}
