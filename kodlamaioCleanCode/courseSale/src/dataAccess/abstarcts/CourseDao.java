package dataAccess.abstarcts;

import entities.concretes.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    List<Course> getCourse();
}
