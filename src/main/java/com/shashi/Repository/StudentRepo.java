package com.shashi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shashi.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	

}
