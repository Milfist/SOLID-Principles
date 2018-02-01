package com.mik;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebaController2 {
	@RequestMapping("/z")
	@ResponseBody
	String home() {
		return "M = " + 6 * 5;
	}
}
