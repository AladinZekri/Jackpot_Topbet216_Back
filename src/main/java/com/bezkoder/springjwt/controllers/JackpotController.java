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

import com.bezkoder.springjwt.models.Jackpot;
import com.bezkoder.springjwt.repository.JackpotRepository;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class JackpotController {
	@Autowired
	private JackpotRepository repo ;
	
	// Create
	@PostMapping("/addJackpot")
	public Jackpot createPartner(@RequestBody  Jackpot e) {
		return this.repo.save(e);
		
		
	
			}	 
		

// get all projects
@GetMapping("/allJackpot")
public List<Jackpot> getUsers(){
	return repo.findAll();
	}
@GetMapping("/Jackpot/{id}")
public  Optional<Jackpot> getedi(@PathVariable long id){
	return repo.findById(id);
	}
// update project 
@PutMapping("/updateJackpotr/{id}")
public ResponseEntity<Jackpot> updatePartner (@PathVariable(value="id") long uid,
		@RequestBody Jackpot x )
{
	Jackpot e = repo.getOne(uid);
	e.setEndDate(x.getEndDate());
	e.setStartDate(x.getStartDate());
	
	repo.save(e);
	return ResponseEntity.ok().build();
	
	
				
	
}

//delete
@DeleteMapping("/deleteJackpot/{id}")  
private void deleteBook(@PathVariable("id") long id)   
{
	Jackpot e = repo.getOne(id);

this.repo.delete(e);
}  



}
