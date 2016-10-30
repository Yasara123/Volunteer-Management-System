package com.im.struts.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.im.struts.db.DB;
import com.im.struts.entity.Audio;

public class AudioDAO {
	public static List<Audio> list(){
		List<Audio> list = new ArrayList<Audio>();
		String sql = "SELECT * FROM audio";
		try {
			
			ResultSet rs = DB.getConnection().createStatement().executeQuery(sql);
			while(rs.next()){
				Audio audio = new Audio();
				audio.setId(rs.getInt("id"));
				audio.setName(rs.getString("name"));
				audio.setArtist(rs.getString("artist"));
				audio.setImage(rs.getString("image"));
				audio.setFile(rs.getString("file"));
				list.add(audio);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return list;
	}
}
