package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
public class TestController {

	@GetMapping("/sum")
	public String sum(Model model) {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		model.addAttribute("sum", result);
		return "sum";
	}
	
	@GetMapping("/multi_table")
	public String multiTable() {
		return "multi_table";
	}
	
	@GetMapping("/multi")
	public String multi(@RequestParam int number, Model model) {
		String result = "";
		for(int i=1; i<=9; i++) {
			result += number + " * " + i + " = " + (i*number) + "<br>";
		}
		model.addAttribute("result", result);
		return "result";
	}
}
