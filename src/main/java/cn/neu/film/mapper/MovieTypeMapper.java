package cn.neu.film.mapper;

import cn.neu.film.pojo.MovieType;

import java.util.List;

public interface MovieTypeMapper {
    /**
     * 增加电影类型
     */
    public int addMovieType(MovieType movieType);
    /**
     * 寻找电影类型
     */
    public String findMovieTypeName(String movieTypeName);
    /**
     * 查询类型
     */
    public List<MovieType> findMovieType();
}
