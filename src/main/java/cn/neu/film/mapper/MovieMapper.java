package cn.neu.film.mapper;

import cn.neu.film.pojo.Movie;

import java.util.List;

public interface MovieMapper {
    /**
     * 添加电影
     */
    public int addMovie(Movie movie);

    /**
     * 查询电影
     */
    public List<Movie> findAllMovie();

    /**
     * 删除电影
     */
    public int delMovie(int mId);

    /**
     * 查询电影
     * 包含类型 元素 地区
     */
    public List<Movie> findAllMovie2();

    /**
     * 根据电影名查询电影
     */
    public List<Movie> findAllMovieByName(String mName);

    /**
     * 更新电影信息
     */
    public int updateMovie(Movie movie);

    List<Movie> findMovieByType(int mtId);

    List<Movie> findMovieByColumn(int mcId);

    List<Movie> findMovieByLocation(int mlId);

    Movie findMovieById(int getmId);
}
