package in.ashokit.repo;

import in.ashokit.binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;

public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
