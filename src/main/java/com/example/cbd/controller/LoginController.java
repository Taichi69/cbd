package com.example.cbd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("login")
	public String showLoginForm(Model model) {
		return "login/Login";
	}

	/**
	 * メインページに遷移する。 ログインが成功した場合、このメソッドが呼び出される。
	 */
	@RequestMapping("/")
	public String login(Model model) {

		// メインページ。
		return "login/index";
	}
}
