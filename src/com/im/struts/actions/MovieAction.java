package com.im.struts.actions;

import java.util.List;

import com.im.struts.dao.MovieDAO;
import com.im.struts.entity.Movie;

public class MovieAction {
	
	public List<Movie> list;
	public String execute(){
		System.out.print("Movie Action Called...");
		
		try{
			list=MovieDAO.list("");
			return"success";
		}catch(Exception e){
			return "error";
		}

	}
}
