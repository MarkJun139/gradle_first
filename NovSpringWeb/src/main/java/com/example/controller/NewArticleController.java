
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.command.NewArticleCommand;
import com.example.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle")
public class NewArticleController {

	@Autowired
	private ArticleService articleService;

	// @RequestMapping 메서드의 리턴 타입이 String => return값을 viewname으로 사용
	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public String form() {
		return "article/newArticleForm";
	}

	@PostMapping
	public String submit(@ModelAttribute("command") NewArticleCommand command) {
		//1. DispatcherServlet이 NewArticleCommand객체 생성 - 매개변수에 주소값 전달
		//2. @*Mapping이 요청파라미터(form데이터) 값을 변수명에 맞게 저장(setter)
		
		articleService.writeArticle(command);
		return "article/newArticleSubmit"; //viewname
		//3. DispatherServlet이 생성한 객체는 전부 view로 전달(model)
		//4. model [key = value]
		//key를 지정하지 않으면 타입(클래스명)을 첫글자 소문자로 사용
		//@ModelAttribute("key") : 모델 key로 지정해준다.	
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

}