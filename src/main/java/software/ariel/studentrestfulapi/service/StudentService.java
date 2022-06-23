package software.ariel.studentrestfulapi.service;

import org.springframework.stereotype.Service;
import software.ariel.studentrestfulapi.entity.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(1L,"Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 23)
        );
    }

}