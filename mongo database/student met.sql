CREATE DATABASE MET;

USE MET;

CREATE TABLE Students(
student_id INT PRIMARY KEY,
name VARCHAR(50),
age INT,
department VARCHAR(50)
);

CREATE TABLE Courses(
course_id INT PRIMARY KEY,
course_name VARCHAR(50),
credits INT
);

CREATE TABLE Enrollments(
student_id INT,
course_id INT,
grade CHAR(1),
FOREIGN KEY (student_id) REFERENCES Students(student_id),
FOREIGN KEY (course_id) REFERENCES Courses(course_id)
);

CREATE TABLE Faculty(
faculty_id INT PRIMARY KEY,
faculty_name VARCHAR(50),
department VARCHAR(50)
);

SHOW TABLES;

INSERT INTO Students VALUES
(100, "Sarvesh", 20, "IT"),
(200, "Ramesh", 22, "Mech"),
(250, "Dnyaneshwar", 20, "Comp"),
(101, "Shubham", 21, "IT");

INSERT INTO Courses VALUES
(500, "BE", 21),
(501, "BTECH", 22),
(402, "Pharmacy", 40);

INSERT INTO Enrollments VALUES
(100, 500, 'A'),
(200, 501, 'B'),
(250, 500, 'A'),
(101, 501, 'C');

INSERT INTO Faculty VALUES
(1001, "Ahire", "IT"),
(1002, "Sonawane", "Comp"),
(1003, "Wagh", "Mech"),
(1004, "Lahane", "IT");

SELECT * FROM Students;
SELECT * FROM Courses;
SELECT * FROM Enrollments;
SELECT * FROM Faculty;

-- Question 1
SELECT * FROM Students;

-- Question 2
SELECT name, department FROM Students WHERE department="Comp";

-- Question 3
SELECT * FROM Students WHERE age>21;

-- Question 4
SELECT name FROM Students ORDER BY age;

-- Question 5
SELECT DISTINCT department FROM Students;

-- Question 6
SELECT COUNT(department) FROM Students WHERE department="IT";

-- Question 7
SELECT * FROM Students WHERE name LIKE "S%";

-- Question 8
SELECT * FROM Students WHERE department="Comp" OR department="IT";

-- Question 9
SELECT * FROM Students WHERE age = (SELECT MAX(age) FROM Students);

-- Question 10
SELECT * FROM Students WHERE age>20 AND age<22;