package com.example.demo.Repository;import com.example.demo.Entity.User;import org.springframework.data.repository.CrudRepository;public interface UserRepository extends CrudRepository<User,Integer> {    User findByEmail(String email);}