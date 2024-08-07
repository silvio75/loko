package tech.loko.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tech.loko.course.entity.Course;

// CourseRepository.java
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
