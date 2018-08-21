package com.example.demo.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Article;
import com.example.demo.model.Author;
import com.example.demo.service.ArticleService;


@RequestMapping("/demo")
@RestController
public class AuthorResource {

	@Autowired
	ArticleService articleService;
	
	@PostMapping
	@RequestMapping("/save")
	public String saveAuthod() {
		Article article=new Article();
		List<Author> authors=new ArrayList<>();
		Author author=new Author();
		authors.add(author);
		article.setAuthors(authors);
		article.setId("1");
		article.setTags("Java");
		article.setTitle("Java");
		
		articleService.save(article);
		return "Success";
		
	}
}
