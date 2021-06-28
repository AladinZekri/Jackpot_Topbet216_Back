package com.bezkoder.springjwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bezkoder.springjwt.models.Jackpot;


public interface JackpotRepository  extends JpaRepository<Jackpot, Long> {

}
