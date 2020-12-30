package rs.caslav.SpringExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.caslav.SpringExample.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {
}
