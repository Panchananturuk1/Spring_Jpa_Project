package jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpa.controller.UserRepo;
import jpa.user.User;


@SpringBootApplication

public class SpringJpaProApplication {
	
	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringJpaProApplication.class, args);
	
	UserRepo repo = context.getBean(UserRepo.class);
	
//Create object of user1
//	User user1 = new User();
//	user1.setName("ROCKING");
//	user1.setCity("SUNABEDA");
//	user1.setStatus(".NET programmer");

//Create object of user1
//	User user2 = new User();
//	user2.setName("hero");
//	user2.setCity("jeypore");
//	user2.setStatus("C programmer");
	
	
	//SAVING SINGLE USER
//User result = repo.save(user2);
	
	//SAVING MULTIPLE USER
//	List<User> users = List.of(user1,user2);	
//	Iterable<User> result = repo.saveAll(users);
//
//	result.forEach(user->{
//		System.out.println(user);
//	});

//	System.out.println("done");
	
	//UPDATING ID 3 CITY NAME
//	Optional<User> optional = repo.findById(3);
//	User user = optional.get();
//	user.setCity("Bhubaneswar");
//	User result = repo.save(user);
//	System.out.println(result);
	
	// GET ALL DATA
//	Iterable<User> itr = repo.findAll();
//	itr.forEach(user->{System.out.println(user);});
				//OR
//	Iterator<User> iterator = itr.iterator();
//	
//	while (iterator.hasNext()) {
//		User user = iterator.next();
//		System.out.println(user);
//		
//	}
	
	
	//DELETING THE USER by ID 
//	repo.deleteById(5);
//	System.out.println("deleted");
	
	//DELETING THE ALL USERS
//	Iterable<User> alldelete = repo.findAll();
//	alldelete.forEach(user->{System.out.println(user);});
//	repo.deleteAll(alldelete);
	
	
	}

}

