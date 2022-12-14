package com.example.core.repository;


import com.example.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
