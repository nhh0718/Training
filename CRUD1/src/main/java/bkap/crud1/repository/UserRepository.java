package bkap.crud1.repository;import bkap.crud1.entity.User;import org.springframework.data.repository.CrudRepository;import org.springframework.stereotype.Repository;@Repositorypublic interface UserRepository extends CrudRepository<User, Long> { }