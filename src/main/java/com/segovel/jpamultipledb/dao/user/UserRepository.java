package com.segovel.jpamultipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.segovel.jpamultipledb.model.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}