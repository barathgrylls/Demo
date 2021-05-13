package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Model.Users;
import dao.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository repository;
	
	
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody Users user) {
		repository.save(user);
		return "SUCCESS";
	}
	
	@GetMapping("/getAllUsers")
	public List<Users> getAllUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Users> getAllUsersByID(@PathVariable int id){
		return repository.findById(id);
	}
}
