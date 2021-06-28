package com.bezkoder.springjwt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bezkoder.springjwt.models.Winner;



public interface WinnerRepository  extends JpaRepository<Winner, Long> {
	  public List<Winner> findAllByOrderByIdDesc();
	  
	  @Query(nativeQuery = true, value = "SELECT * FROM `winners` ORDER BY id DESC LIMIT 5")
	  List<Winner> getWinnersLimit();
	  
	  @Query(nativeQuery = true, value = "SELECT * FROM `winners`ORDER BY amout DESC LIMIT 5")
	  List<Winner> getWinnersLimitAmount();
}
