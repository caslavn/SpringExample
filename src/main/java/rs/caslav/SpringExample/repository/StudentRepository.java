package rs.caslav.SpringExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.caslav.SpringExample.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

     //List<Student> studentList = new ArrayList<>();

    //private List<Student> getStudentList() {
      //  return getStudentList();
    //}

   // List<Student> setStudent(Student student) {
        //studentList.add(student);
   // }
}
