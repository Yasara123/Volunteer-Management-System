package com.im.struts.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.im.struts.db.DB;
import com.im.struts.entity.Movie;

public class MovieDAO {
	public static List<Movie> list(String where) {
		List<Movie> list = new ArrayList<Movie>();
		String sql = "SELECT * FROM movie "+where ;
		try {
			
			ResultSet rs = DB.getConnection().createStatement().executeQuery(sql);
			while(rs.next()){
				Movie movie = new Movie();
				movie.setId(rs.getInt("id"));
				movie.setName(rs.getString("name"));
				movie.setDescription(rs.getString("description"));
				movie.setRate(rs.getDouble("rate"));
				movie.setImage(rs.getString("image"));
				movie.setYear(rs.getInt("year"));
				movie.setFile(rs.getString("file"));
				list.add(movie);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
}
