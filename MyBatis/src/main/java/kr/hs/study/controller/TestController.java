package kr.hs.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.model.DataBean;
import kr.hs.study.service.TestInterface;

@Controller
public class TestController {	
	@Autowired
	private TestInterface service;

	@GetMapping("/input_data")
	public String input() {
		return "input";
	}
	
	@PostMapping("/re_input")
	public String re_input(DataBean bean) {
		service.insert(bean);
		return "result";
	}
	
	@GetMapping("/read_data")
	public String read(Model model) {
		model.addAttribute("list", service.select());
		return "read";
	}
	
	@GetMapping("/update_data")
	public String update() {
		return "update";
	}
	
	@PostMapping("/re_update")
	public String re_update(DataBean bean) {
		service.update(bean);
		return "result";
	}
}
