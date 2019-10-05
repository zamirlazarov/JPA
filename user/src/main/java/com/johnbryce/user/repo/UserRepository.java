package com.johnbryce.user.repo;

import java.util.List;

import javax.management.Query;

import org.springframework.data.jpa.repository.JpaRepository;

import com.johnbryce.user.repo.beans.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public List<User> findByEducation(String education);

//	@org.springframework.data.jpa.repository.Query("update user set name=? where id=?")
//    public List<User> updateNameById(String name , long id);
}
