package com.segovelo.jpamultipledb.dao.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.segovelo.jpamultipledb.model.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}