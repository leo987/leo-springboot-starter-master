package com.leo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.leo.pojo.LeoJSONResult;
import com.leo.pojo.User;

//@Controller
@RestController		// @RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		
		User u = new User();
		u.setName("imooc7");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc7");
		u.setDesc("hello imooc7~~");
		
		return u;
	}
	
	@RequestMapping("/getUserJson")
//	@ResponseBody
	public LeoJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setBirthday(new Date());
		u.setPassword("imooc");
		u.setDesc("hello imooc~~hello imooc~~");
		
		return LeoJSONResult.ok(u);
	}
}
