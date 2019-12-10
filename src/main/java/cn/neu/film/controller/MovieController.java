package cn.neu.film.controller;

import cn.neu.film.pojo.Movie;
import cn.neu.film.pojo.MovieColumn;
import cn.neu.film.pojo.MovieLocation;
import cn.neu.film.pojo.MovieType;
import cn.neu.film.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//github提交成功了吗???

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    //添加电影
    @RequestMapping("/addMovie")
    public String addMoive(@RequestBody Movie movie) throws Exception{
        int i = movieService.addMovie(movie);
        System.out.println("添加了"+i);
        System.out.println(movie.toString());
        return "success";
    }
    //查询所有电影
    @RequestMapping("/MovieList")
    public List<Movie> MovieList() throws Exception{
        List<Movie> movies = movieService.findAllMovie2();
        return movies;
    }
    //删除电影
    @RequestMapping("/deleteMovie")
    public String deleteMovie(@RequestBody Movie movie) throws Exception{
        int i = movieService.delMovie(movie.getmId());
        if(i==1){
            return "success";
        }else {
            return "fail";
        }
    }
    //更新电影
    @RequestMapping("/updateMovie")
    public String updateMovie(@RequestBody Movie movie)throws Exception{
        int i = movieService.updateMovie(movie);
        if(i==1){
            return "success";
        }else {
            return "fail";
        }

    }
    //通过电影名查电影
    @RequestMapping("/MovieListByName")
    public List<Movie> MovieList(@RequestBody Movie movie) throws Exception{
        List<Movie> movies = movieService.findAllMovieByName(movie.getmName());
        return movies;
    }

    //通过id查电影
    @RequestMapping("/MovieListById")
    public Movie MovieListById(@RequestBody Movie movie) throws Exception{
        Movie resultmovie = movieService.findAllMovieById(movie.getmId());
        return resultmovie;
    }


    //添加电影元素
    @RequestMapping("/addMovieColumn")
    public String addMovieColumn(@RequestBody MovieColumn movieColumn) throws Exception{
        String name = movieService.checkColumn(movieColumn.getMcName());
        if(name.equals("false")){
            System.out.println("元素名可用");
            int i = movieService.addMovieColumn(movieColumn);
        }else {
            System.out.println("元素名不可用");
        }
        return "../../addMovie";
    }

    //查询电影元素
    @RequestMapping("/findMovieColumn")
    public List<MovieColumn> findMovieColumn() throws Exception{
        List<MovieColumn> movieColumns = movieService.findMovieColumn();
        return movieColumns;
    }


    //添加电影地区
    @RequestMapping("/addMovieLocation")
    public String addMovieLocation(@RequestBody MovieLocation movieLocation) throws Exception{
        String name = movieService.checkLocation(movieLocation.getMlName());
        if(name.equals("false")){
            System.out.println("地区名可用");
            int i = movieService.addMovieLocation(movieLocation);
        }else {
            System.out.println("地区名不可用");
        }
        return "../../addMovie";
    }

    //查询电影地区
    @RequestMapping("/findMovieLocation")
    public List<MovieLocation> findMovieLocation() throws Exception{
        List<MovieLocation> movieLocation = movieService.findMovieLocation();
        return movieLocation;
    }

    //添加电影类型
    @RequestMapping("/addMovieType")
    public String addMovieType(@RequestBody MovieType movieType) throws Exception{
        String name = movieService.checkType(movieType.getMtName());
        if(name.equals("false")){
            System.out.println("类型名可用");
            int i = movieService.addMovieType(movieType);
        }else {
            System.out.println("类型名不可用");
        }
        return "../../addMovie";
    }
    //查询电影类型
    @RequestMapping("/findMovieType")
    public List<MovieType> findMovieType() throws Exception{
        List<MovieType> movieType = movieService.findMovieType();
        return movieType;
    }

    @RequestMapping("/findMovieByType")
    public  List<Movie> findMovieByType(@RequestBody MovieType movieType) throws Exception{
        List<Movie> movies = movieService.findMovieByType(movieType.getMtId());
        return movies;
    }

    @RequestMapping("/findMovieByColumn")
    public  List<Movie> findMovieByColumn(@RequestBody MovieColumn movieColumn) throws Exception{
        List<Movie> movies = movieService.findMovieByColumn(movieColumn.getMcId());
        return movies;
    }

    @RequestMapping("/findMovieByLocation")
    public  List<Movie> findMovieByLocation(@RequestBody MovieLocation movieLocation) throws Exception{
        List<Movie> movies = movieService.findMovieByLocation(movieLocation.getMlId());
        return movies;
    }

}
