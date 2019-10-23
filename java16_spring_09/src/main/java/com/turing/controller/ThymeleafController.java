package com.turing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf的使用
 * @author fred
 *
 */
@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("msg", "你好，Thymeleaf");
		return "index";
	}
}
