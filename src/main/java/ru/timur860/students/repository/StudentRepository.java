package ru.timur860.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.timur860.students.model.Student;

public interface StudentRepository extends JpaRepository <Student, Long> {
}
