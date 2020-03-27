package com.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.modal.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	@Query("select e from Movie e where e.title like ?1")
	public Movie get(String s);
	
	@Query("select e from Movie e where e.dateOfLaunch<='2020-03-27'")
	public List<Movie> nowPlaying();
}
