package kr.hs.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Scanner;

@Controller
public class TestController {

	@GetMapping("/sum")
	public String sum() {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result += i;
		}
		System.out.println("1부터 10까지의 합 : " + result);
		return "result";
	}
	
	@GetMapping("/multi_table")
	public String multiTable() {
		return "multi_table";
	}
	
	@GetMapping("/multi")
	public String multi(@RequestParam int number) {
		for(int i=1; i<=9; i++) {
			System.out.println(i + " * " + number + " = " + (i*number));
		}
		return "result";
	}
}
