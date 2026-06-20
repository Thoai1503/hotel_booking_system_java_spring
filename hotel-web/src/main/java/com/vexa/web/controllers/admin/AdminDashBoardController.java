package com.vexa.web.controllers.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RequestMapping("/admin")
public class AdminDashBoardController {
	private Logger  LOGGER = LoggerFactory.getLogger(AdminDashBoardController.class);

	@GetMapping("/dashboard")
	public String dashboard() {

		return "admin/index";
	}
}
