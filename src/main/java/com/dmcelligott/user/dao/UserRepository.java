package com.dmcelligott.user.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dmcelligott.user.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findByUserName(String userName);
}
