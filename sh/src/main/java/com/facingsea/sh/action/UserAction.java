package com.facingsea.sh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.facingsea.sh.domain.User;
import com.facingsea.sh.service.UserService;

@Controller
@RequestMapping("/user")
public class UserAction {
	
	private static Logger log = LoggerFactory.getLogger(UserAction.class);
	
	@Autowired
	private UserService userService;

	public UserAction() {
		log.info("UserAction构造");
	}
	
	@RequestMapping("saveUser")
	public void saveUser(HttpServletRequest req, HttpServletResponse resp, 
			User user){
		System.out.println(user);
		log.debug("debug: " + user);
		log.info("info: " + user);
		userService.saveUser(user);
	}
	
}
