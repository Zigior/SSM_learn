package cn.neu.film.mapper;

import cn.neu.film.pojo.MovieLocation;

import java.util.List;

public interface MovieLocationMapper {
    /**
     * 增加电影地区
     */
    public int addMovieLocation(MovieLocation movieLocation);
    /**
     * 寻找电影地区
     */
    public String findMovieLocationName(String movieLocationName);
    /**
     * 查询地区
     */
    public List<MovieLocation> findMovieLocation();
}
