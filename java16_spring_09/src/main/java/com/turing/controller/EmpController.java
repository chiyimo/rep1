package com.turing.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.turing.entity.Emp;
import com.turing.service.IEmpService;

@Controller
public class EmpController {
	
	@Autowired
	private IEmpService empService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<Emp> list = empService.findAll();
		model.addAttribute("list", list);
		return "show";
	}
	
	//域对象传递数据
	@RequestMapping("/inner")
	public String inner(HttpServletRequest request) {
		//请求域
		request.setAttribute("requestMsg", "请求域-张三");
		//会话域
		request.getSession().setAttribute("sessionMsg", "回话域-张三");
		//全局域
		request.getServletContext().setAttribute("applicationMsg", "全局域-张三");
		return "index";
	}
}
