package com.example.demo.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.article;

public interface ArticleService extends MongoRepository<article,Integer>{

}
