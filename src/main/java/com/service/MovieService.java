package com.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movierepo;
	
	public List<Movie> getAll(){
		return movierepo.findAll();
	}
	
	public int update(String title, String boxOffice, boolean active, Date dateOfLaunch, String genre, boolean hasTeaser)
 {
		Movie temp=movierepo.get(title);
		temp.setBoxOffice(boxOffice);
		temp.setDateOfLaunch(dateOfLaunch);
		temp.setActive(active);
		temp.setGenre(genre);
		temp.setHasTeaser(hasTeaser);
		movierepo.save(temp);
		 return 1;
	}
	
	public List<Movie> now(){
		return movierepo.nowPlaying();
	}
}
