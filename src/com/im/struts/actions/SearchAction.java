package com.im.struts.actions;

import java.util.List;

import com.im.struts.dao.MovieDAO;
import com.im.struts.entity.Movie;

public class SearchAction {

	public String search;	
	public List<Movie> list;
	
	public String searchMovie(){
		try{
			list=MovieDAO.list("Where name LIKE '%"+search+"%' ");
			return "success";
		}catch(Exception e){
			return "error";
		}
	}
	
}
