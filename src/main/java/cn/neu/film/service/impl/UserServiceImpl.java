package cn.neu.film.service.impl;

import cn.neu.film.mapper.UserMapper;
import cn.neu.film.mapper.UserStateMapper;
import cn.neu.film.pojo.User;
import cn.neu.film.pojo.UserState;
import cn.neu.film.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserStateMapper userStateMapper;
    @Override
    public int addUser(User user) {
        int i = userMapper.addUser(user);
        return i;
    }

    @Override
    public String checkLogin(String uNameOruMail) {
        String uPwd = userMapper.checkLogin(uNameOruMail);
        if(uPwd==null||uPwd.equals("")){
            return "false";
        }else {
            return uPwd;
        }
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = userMapper.findAllUser();
        return users;
    }

    @Override
    public List<User> findUserByuNameOruMail(String getuName) {
        List<User> users = userMapper.findUserByuNameOruMail(getuName);
        return users;
    }

    @Override
    public int deleteUser(int getuId) {
        int i = userMapper.deleteUser(getuId);
        return i;
    }

    @Override
    public List<UserState> findUserState() {
        List<UserState> userStates = userStateMapper.findUserState();
        return userStates;
    }

    @Override
    public int updateUser(User user) {
        int i = userMapper.updateUser(user);
        return i;
    }

    @Override
    public User findUserByName(String getuName) {
        User user = userMapper.findUserByName(getuName);
        return user;
    }


}
