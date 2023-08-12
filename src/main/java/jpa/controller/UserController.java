package jpa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import form.crud.model.Employee;
import jpa.user.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserRepo userRepo;
	
	@GetMapping("/user")
	public ResponseEntity<List<User>> getAllUsers(){
//		List<Employee> emplist = new ArrayList<>();
//		employeeRespository.findAll().forEach(emplist::add);
//		return new ResponseEntity<List<Employee>>(emplist,HttpStatus.OK);
		List<User> userlist = new ArrayList<>();
		userRepo.findAll().forEach(userlist::add);
		return new ResponseEntity<List<User>>(userlist,HttpStatus.OK);
	}
	
}
