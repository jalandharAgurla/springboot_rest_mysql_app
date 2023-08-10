package in.ashokit.service;

import in.ashokit.binding.Course;

import java.util.List;

public interface CourseService {
    public String upsert(Course course);
      public Course getById(Integer cid);
      public List<Course> getAllCourse();

      public String deleteById(Integer cid);


}
