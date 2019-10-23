package com.turing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Thymeleaf��ʹ��
 * @author fred
 *
 */
@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("msg", "��ã�Thymeleaf");
		return "index";
	}
}
