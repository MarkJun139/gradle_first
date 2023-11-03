package com.example.service;

import lombok.Data;   
   
@Data
public class NewArticleCommand {
	
	private String title;
	private String content;
	private int parentId;
  
}