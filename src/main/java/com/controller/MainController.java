package com.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.modal.Movie;
import com.service.MovieService;



@Controller
public class MainController {
	@Autowired
	private MovieService service;
   
	

	
	
	
	
	
	@GetMapping("/admin")
	public String get(Model m) {
	     List<Movie>temp=service.getAll();
	     int i=1;
	     for(Movie e:temp) {
	    	 m.addAttribute("name"+i, e.getTitle());
	    	 m.addAttribute("active"+i, e.isActive()?"Active":"Not Active");
	    	 m.addAttribute("genre"+i, e.getGenre());
	    	 m.addAttribute("teaser"+i, e.isHasTeaser()?"Teaser":"No teaser");
	    	 m.addAttribute("date"+i,e.getDateOfLaunch() );
	    	 m.addAttribute("price"+i,e.getBoxOffice() );
	    	 i++;
	     }
		return "AdminHome";
	}
	@GetMapping("/edit")
	public String edit(@ModelAttribute("movie") Movie m,BindingResult br,Model r) {
		return "AdminEdit";
	}
	
	
	@ModelAttribute("countryList")
	   public Map<String, String> getCountryList() {
	      Map<String, String> countryList = new HashMap<String, String>();
	      countryList.put("thriller", "thriller");
	      countryList.put("adventure", "adventure");
	      countryList.put("comedy", "comedy");
	      countryList.put("action", "action");
	      return countryList;
	   }
	@PostMapping("/AdminHome")
	public String home(@ModelAttribute("movie") Movie movie,BindingResult br,Model m) {
		
		int j=service.update(movie.getTitle(),movie.getBoxOffice(),movie.isActive(),movie.getDateOfLaunch(),movie.getGenre(), movie.isHasTeaser());
		
		if(j==1) {
			 List<Movie>temp=service.getAll();
		     int i=1;
		     for(Movie e:temp) {
		    	 m.addAttribute("name"+i, e.getTitle());
		    	 m.addAttribute("active"+i, e.isActive()?"Active":"Not Active");
		    	 m.addAttribute("genre"+i, e.getGenre());
		    	 m.addAttribute("teaser"+i, e.isHasTeaser()?"Teaser":"No teaser");
		    	 m.addAttribute("date"+i,e.getDateOfLaunch() );
		    	 m.addAttribute("price"+i,e.getBoxOffice() );
		    	 i++;
		     }
		}
		
		return"AdminHome";
	}
	
	
	
	
	
	@GetMapping("/customer")
	public String customer(Model m) {
		
		
		
		List<Movie> temp=service.now();
		
		 int i=1;
	    for(Movie e:temp) {
	    	 m.addAttribute("name"+i, e.getTitle());
		 m.addAttribute("active"+i, e.isActive()?"Active":"Not Active");
	    	 m.addAttribute("genre"+i, e.getGenre());
	    	 m.addAttribute("teaser"+i, e.isHasTeaser()?"Teaser":"No teaser");
	    	 m.addAttribute("date"+i,e.getDateOfLaunch() );
	     m.addAttribute("price"+i,e.getBoxOffice() );
	     i++;
	     }
		//m.addAttribute("val",temp);
		return "CustomerMain";
	}
	
}
