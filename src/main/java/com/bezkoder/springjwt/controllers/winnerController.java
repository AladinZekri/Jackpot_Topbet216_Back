package com.bezkoder.springjwt.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.springjwt.models.Winner;
import com.bezkoder.springjwt.repository.WinnerRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")

public class winnerController {

	@Autowired
	private WinnerRepository repo ;
	
	// Create
	@PostMapping("/addWinner")
	public Winner createPartner(@RequestBody  Winner e) {
		return this.repo.save(e);
		
		
	
			}	 
		

// get all projects
@GetMapping("/allWinners")
public List<Winner> getUsers(){
	return repo.findAllByOrderByIdDesc();
	}
@GetMapping("/allWinnersLimit")
public List<Winner> getUsersLimit(){
	return repo.getWinnersLimit();
	}
@GetMapping("/allWinnersAmountLimit")
public List<Winner> getUsersLimitAmount(){
	return repo.getWinnersLimitAmount();
	}
@GetMapping("/winner/{id}")
public  Optional<Winner> getedi(@PathVariable long id){
	return repo.findById(id);
	}
// update project 
@PutMapping("/updateWinner/{id}")
public ResponseEntity<Winner> updatePartner (@PathVariable(value="id") long uid,
		@RequestBody Winner x )
{
	Winner e = repo.getOne(uid);
	e.setName(x.getName());
	e.setAmout(x.getAmout());
	e.setWinDate(x.getWinDate());
	repo.save(e);
	return ResponseEntity.ok().build();
	
	
				
	
}

//delete
@DeleteMapping("/deleteWinner/{id}")  
private void deleteBook(@PathVariable("id") long id)   
{
	Winner e = repo.getOne(id);

this.repo.delete(e);
}  






}
