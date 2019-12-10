package cn.neu.film.service;

import cn.neu.film.pojo.Movie;
import cn.neu.film.pojo.MovieColumn;
import cn.neu.film.pojo.MovieLocation;
import cn.neu.film.pojo.MovieType;

import java.util.List;

public interface MovieService {
    /**
     * 添加电影
     */
    int addMovie(Movie movie);

    /**
     * 查询所有电影
     */
    List<Movie> findAllMovie();

    /**
     * 查询所有电影
     * 附带类型 元素 地区
     */
    List<Movie> findAllMovie2();

    /**
     * 删除电影
     */
    int delMovie(int mId);
    /**
     * 通过电影名查电影
     */
    List<Movie> findAllMovieByName(String mName);

    /**
     * 添加电影元素
     */
    int addMovieColumn(MovieColumn movieColumn);

    /**
     * 检查元素
     */
    String checkColumn(String movieColumnName);
    /**
     * 查询元素
     */
    List<MovieColumn> findMovieColumn();

    /**
     * 添加电影地区
     */
    int addMovieLocation(MovieLocation movieLocation);

    /**
     * 检查地区
     */
    String checkLocation(String movieLocationName);

    /**
     * 查询地区
     */
    List<MovieLocation> findMovieLocation();

    /**
     * 添加电影类别
     */
    int addMovieType(MovieType movieType);

    /**
     * 检查类型
     */
    String checkType(String movieTypeLocation);
    /**
     * 查询类型
     */
    List<MovieType> findMovieType();
    /**
     * 更新电影信息
     */
    int updateMovie(Movie movie);

    List<Movie> findMovieByType(int mtId);

    List<Movie> findMovieByColumn(int mcId);

    List<Movie> findMovieByLocation(int mlId);

    Movie findAllMovieById(int getmId);
}
