/**
 * 
 */
package com.dhana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author DhanabalanV
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/testme.do")
	public @ResponseBody String test(){
		return "sivam";
	}
}
