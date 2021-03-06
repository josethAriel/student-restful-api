package software.ariel.studentrestfulapi.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.ariel.studentrestfulapi.entity.Student;
import software.ariel.studentrestfulapi.repository.StudentRepository;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student("Mariam", "mariam.jamal@gmail.com", LocalDate.of(2000, Month.JANUARY, 5));
            Student alex = new Student("Alex", "alex.jl@gmail.com", LocalDate.of(2004, Month.JANUARY, 1));
            repository.saveAll(List.of(mariam, alex));
        };
    }

}
