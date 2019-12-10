package cn.neu.film.mapper;

import cn.neu.film.pojo.User;

import java.util.List;

public interface UserMapper {
    int addUser(User user);

    /**
     * 登录
     */
    String checkLogin(String uNameOruMail);
    /**
     * 查询所有用户
     */
    List<User> findAllUser();

    /**
     * 通过用户名或邮箱查用户
     */
    List<User> findUserByuNameOruMail(String uName);

    /**
     * 删除(注销)用户
     */
    int deleteUser(int uId);

    /**
     * 更新用户
     */
    int updateUser(User user);

    /**
     * 根据用户名查询用户信息
     */
    User findUserByName(String uName);
}
