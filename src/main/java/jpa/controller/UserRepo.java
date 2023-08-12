package jpa.controller;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jpa.user.User;

public interface UserRepo extends CrudRepository<User, Integer> {
	
//	public List<User> findByName(String name);
//	
//	public List<User> findByNameAndCity(String name,String city);
	
	@Query("select u FROM User u")
	public List<User> getAllUser();

	@Query("select u FROM User u WHERE u.name =:n and u.city=:c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);
}
