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
	
	//����󴫵�����
	@RequestMapping("/inner")
	public String inner(HttpServletRequest request) {
		//������
		request.setAttribute("requestMsg", "������-����");
		//�Ự��
		request.getSession().setAttribute("sessionMsg", "�ػ���-����");
		//ȫ����
		request.getServletContext().setAttribute("applicationMsg", "ȫ����-����");
		return "index";
	}
}
