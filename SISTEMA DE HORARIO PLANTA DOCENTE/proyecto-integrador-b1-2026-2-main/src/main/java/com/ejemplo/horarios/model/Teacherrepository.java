package com.example.app.repository;
import com.example.app.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TeacherRepository extends JpaRepository<Teacher, Long> {}