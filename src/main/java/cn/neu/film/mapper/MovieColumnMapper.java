package cn.neu.film.mapper;

import cn.neu.film.pojo.MovieColumn;

import java.util.List;

public interface MovieColumnMapper {
    /**
     * 增加电影元素
     */
    public int addMovieColumn(MovieColumn movieColumn);
    /**
     * 寻找电影元素名
     */
    public String findMovieColumnName(String movieColumnName);
    /**
     * 查询元素
     */
    public List<MovieColumn> findMovieColumn();
}
