package jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import jpa.controller.UserRepo;
import jpa.user.User;





@SpringBootApplication
public class SpringJpaProApplication {
	public static void main(String[] args) {
	SpringApplication.run(SpringJpaProApplication.class, args);

//public class SpringJpaProApplication {
//
//	public static void main(String[] args) {
//	ApplicationContext context = SpringApplication.run(SpringJpaProApplication.class, args);
//	
//	UserRepo repo = context.getBean(UserRepo.class);
//	
//	
//	User user = new User();
//	
//	user.setName("murkho");
//	user.setCity("koraput");
//	user.setStatus("java programmer");
//	
//	User user1 = repo.save(user);
//	
//	
//	System.out.println(user1);
	}

}

