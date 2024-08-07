package tech.loko.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.loko.course.entity.User;

// UserRepository.java
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
