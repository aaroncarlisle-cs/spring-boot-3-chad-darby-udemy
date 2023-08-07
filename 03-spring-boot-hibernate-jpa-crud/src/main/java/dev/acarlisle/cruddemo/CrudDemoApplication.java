package dev.acarlisle.cruddemo;

import dev.acarlisle.cruddemo.dao.StudentDAO;
import dev.acarlisle.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			// readStudent(studentDAO);

			queryForStudents(studentDAO);
		};
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display list of students
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		// create a student object
		Student tempStudent = new Student("Daffy", "Duck", "daffy@luv2code.com");

		// save the student
		studentDAO.save(tempStudent);

		// display id of the saved student
		int theId = tempStudent.getId();

		// retrieve student based on the pk id
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);

		// print student
		System.out.println("Found the student; " + myStudent);
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		// create the student objects
		System.out.println("Creating 3 student objects...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the students...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new student object...");
		Student tempStudent = new Student("Paul", "Doe", "paul@luv2code.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display ID of the saved student
		System.out.println("Saved student. Generated id: " + tempStudent.getId());

	}
}
