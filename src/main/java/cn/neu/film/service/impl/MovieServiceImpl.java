package cn.neu.film.service.impl;

import cn.neu.film.mapper.MovieColumnMapper;
import cn.neu.film.mapper.MovieLocationMapper;
import cn.neu.film.mapper.MovieMapper;
import cn.neu.film.mapper.MovieTypeMapper;
import cn.neu.film.pojo.Movie;
import cn.neu.film.pojo.MovieColumn;
import cn.neu.film.pojo.MovieLocation;
import cn.neu.film.pojo.MovieType;
import cn.neu.film.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service("movieService")
public class MovieServiceImpl implements MovieService{
    public static int A = 1;
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    MovieColumnMapper movieColumnMapper;
    @Autowired
    MovieLocationMapper movieLocationMapper;
    @Autowired
    MovieTypeMapper movieTypeMapper;
    @Override
    public int addMovie(Movie movie) {
        int i = movieMapper.addMovie(movie);
        return i;
    }

    @Override
    public List<Movie> findAllMovie() {
        List<Movie> movies = movieMapper.findAllMovie();
        return movies;
    }

    @Override
    public List<Movie> findAllMovie2() {
        List<Movie> movies = movieMapper.findAllMovie2();
        return movies;
    }

    @Override
    public int addMovieColumn(MovieColumn movieColumn) {
        int i = movieColumnMapper.addMovieColumn(movieColumn);
        return i;
    }

    @Override
    public String checkColumn(String movieColumnName) {
        String name = movieColumnMapper.findMovieColumnName(movieColumnName);
        if(name==null||name.equals("")){
            return "false";
        }else {
            return name;
        }
    }

    @Override
    public List<MovieColumn> findMovieColumn() {
        List<MovieColumn> movieColumns = movieColumnMapper.findMovieColumn();
        return movieColumns;
    }

    @Override
    public int addMovieLocation(MovieLocation movieLocation) {
        int i = movieLocationMapper.addMovieLocation(movieLocation);
        return i;
    }

    @Override
    public String checkLocation(String movieLocationName) {
        String location = movieLocationMapper.findMovieLocationName(movieLocationName);
        if(location==null||location.equals("")){
            return "false";
        }else {
            return location;
        }
    }

    @Override
    public List<MovieLocation> findMovieLocation() {
        List<MovieLocation> movieLocation = movieLocationMapper.findMovieLocation();
        return movieLocation;
    }

    @Override
    public int addMovieType(MovieType movieType) {
        int i = movieTypeMapper.addMovieType(movieType);
        return i;
    }

    @Override
    public String checkType(String movieTypeLocation) {
        String type = movieTypeMapper.findMovieTypeName(movieTypeLocation);
        if(type==null||type.equals("")){
            return "false";
        }else {
            return type;
        }
    }

    @Override
    public List<MovieType> findMovieType() {
        List<MovieType> movieType = movieTypeMapper.findMovieType();
        return movieType;
    }

    @Override
    public int updateMovie(Movie movie) {
        int i = movieMapper.updateMovie(movie);
        return i;
    }

    @Override
    public List<Movie> findMovieByType(int mtId) {
        List<Movie> movies = movieMapper.findMovieByType(mtId);
        return movies;
    }

    @Override
    public List<Movie> findMovieByColumn(int mcId) {
        List<Movie> movies = movieMapper.findMovieByColumn(mcId);
        return movies;
    }

    @Override
    public List<Movie> findMovieByLocation(int mlId) {
        List<Movie> movies = movieMapper.findMovieByLocation(mlId);
        return movies;
    }

    @Override
    public Movie findAllMovieById(int getmId) {
        Movie resultmovie = movieMapper.findMovieById(getmId);
        return resultmovie;
    }

    @Override
    public int delMovie(int mId) {
        int i = movieMapper.delMovie(mId);
        return i;
    }

    @Override
    public List<Movie> findAllMovieByName(String mName) {
        List<Movie> movies = movieMapper.findAllMovieByName(mName);
        return movies;
    }
}
