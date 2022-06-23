package software.ariel.studentrestfulapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software.ariel.studentrestfulapi.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
