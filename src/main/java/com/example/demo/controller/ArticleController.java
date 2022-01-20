package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.article;
import com.example.demo.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService articleServ;
	
	@PostMapping("/addArticle")
	public String addArticle(@RequestBody article article) {
		articleServ.save(article);
		return "Successfully added";
	}
	
	@GetMapping("/getArticles")
	public List<article> getListArticle(){	
		return articleServ.findAll();
		}
	@GetMapping("/getArticle/{id}")
	public Optional<article> getArticleById(@PathVariable int id ){	
		return articleServ.findById(id);
		}
	
	@DeleteMapping("/deleteArticle/{id}")
	public String deleteArticleById(@PathVariable int id ){	
		articleServ.deleteById(id);
		return "Successufuly deleted";
		}
	
	
	
}
