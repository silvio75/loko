package tech.loko.course.controller;

import org.springframework.beans.factory.annotation.Autowired;

import tech.loko.course.entity.Course;
import tech.loko.course.service.CourseService;

// CourseController.java
@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }
}
