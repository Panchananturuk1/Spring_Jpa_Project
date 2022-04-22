package jpa.controller;

import org.springframework.data.repository.CrudRepository;

import jpa.user.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
