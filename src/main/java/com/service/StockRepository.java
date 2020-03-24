package com.service;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.modal.stock;

public interface StockRepository extends JpaRepository<stock, String> {

	@Query("SELECT e FROM stock e  WHERE MONTH(e.st_date) = 9 AND YEAR(e.st_date) = 2019")
	public List<stock> getSeptemberStock();
	
	@Query("SELECT e FROM stock e WHERE e.st_code = 'GOOGL' AND e.st_close > 1250")
	public List<stock> getGoogleStocks();

	@Query("SELECT e FROM stock e ORDER BY e.st_volume DESC ")
	public List<stock> getHighestVolumeStocks(Pageable p);
	
	@Query("SELECT e FROM stock e WHERE e.st_code='NFLX' ORDER BY e.st_volume ASC ")
	public List<stock> getLowestVolumeNetflixStocks(Pageable p);
	
	
	
}
