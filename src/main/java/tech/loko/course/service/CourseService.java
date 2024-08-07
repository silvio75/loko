package tech.loko.course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.loko.course.entity.Course;
import tech.loko.course.repository.CourseRepository;

// CourseService.java
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }
}
