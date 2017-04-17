package com.tutorialspoint;

import java.util.List;
import javax.sql.DataSource;
public interface StudentDAO {


//   public void create(Student student);

   public Student getStudent(Integer id);

   public List<Student> listStudents();

//   public void delete(Integer id);

//   public void update(Student student);
   
   
}
