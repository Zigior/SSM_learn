package cn.neu.film.mapper;

import cn.neu.film.pojo.UserState;

import java.util.List;

public interface UserStateMapper {
    /**
     * 增加权限
     */
    int addUserState(UserState userState);

    /**
     * 查询权限
     */
    List<UserState> findUserState();
}
