package cn.neu.film.controller;

import cn.neu.film.pojo.User;
import cn.neu.film.pojo.UserState;
import cn.neu.film.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.List;
import java.util.UUID;


@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserService userService;
    //注册
    @RequestMapping(value = "/regist",produces = "text/html;charset=UTF-8")
    public String regist(@RequestBody User user) throws Exception{
        String name = userService.checkLogin(user.getuName());
        String mail = userService.checkLogin(user.getuMail());
        if(name.equals("false")){
            System.out.println("用户名可用");
            if(mail.equals("false")){
                System.out.println("邮箱可用");
                int i = userService.addUser(user);
                if(i==1){
                    return "注册成功";
                }else {
                    return "注册失败";
                }
            }else {
                return "用户名或邮箱已存在";
            }
        }else {
            return "用户名已存在";
        }
    }

    //登录
    @RequestMapping(value = "/login",produces = "text/html;charset=UTF-8")
    public String login(@RequestBody User user)  throws Exception {
        String USER = user.getuName();
        String UPWD = user.getuPwd();
        System.out.println(USER);
        System.out.println(UPWD);
        String uPwd = userService.checkLogin(USER);
        if (uPwd == null || uPwd.equals("")) {
            System.out.println("该用户不存在");
            return "该用户不存在";
        } else {
            if ( uPwd.equals(UPWD)) {
                System.out.println("登录成功");
                return "登录成功";
            } else if(uPwd.equals("false")){
                System.out.println("用户名或邮箱未注册");
                return "用户名或邮箱未注册";
            }else {
                System.out.println("密码错误");
                return "密码错误";
            }
        }

    }
    //查询所有用户
    @RequestMapping("/UserList")
    public List<User> UserList() throws Exception{
        List<User> users = userService.findAllUser();
        return users;
    }
    //通过用户名或邮箱查用户
    @RequestMapping("/UserListByName")
    public List<User> OrderListByName(@RequestBody User user) throws Exception{
        List<User> users = userService.findUserByuNameOruMail(user.getuName());
        return users;
    }
    //删除(注销)用户
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestBody User user) throws Exception{
        int i = userService.deleteUser(user.getuId());
        if(i==1){
            return "success";
        }else {
            return "fail";
        }
    }
    //查询权限
    @RequestMapping("/findUserState")
    public List<UserState> findUserState() throws Exception{
        List<UserState> userStates = userService.findUserState();
        return userStates;
    }
    //更新用户
    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user) throws Exception{
        int i = userService.updateUser(user);
        if(i==1){
            return "success";
        }else {
            return "fail";
        }
    }

    //上传图片
    @PostMapping("/uploadImage")
    public String uploadImage(@RequestParam("file") MultipartFile upload, HttpServletResponse response) throws Exception{
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Cache-Control","no-cache");
        String imageName = upload.getOriginalFilename();
        String imageRoot = "D:\\upload_2019\\film\\";
        String imageStr = imageName.substring(imageName.lastIndexOf("."));
        String imageFileName = UUID.randomUUID().toString()+imageStr;
        //6.文件地址组装
        upload.transferTo(new File(imageRoot,imageFileName));
        return "http://localhost:8080/resources/"+imageFileName;

    }

    //根据用户名或邮箱查用户信息
    @RequestMapping("/findUserByName")
    public User findUserByName(@RequestBody User user) throws Exception{
        User user1 = userService.findUserByName(user.getuName());
        return user1;
    }
}
