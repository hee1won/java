//package chap13.book.s1306WildCard;
//
//import java.util.Arrays;
//
//import chap06.book.s061101.Person;
//import chap06.lecture.p04method.Student;
//import chap06.lecture.p04method.Worker;
//
//public class WildCardExample {
//	
//	public static void registerCourse( Course <?> course) {		// 모든 과정 
//		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
//	}
//	
//	public static void registerCourseStudent(Course <? extends Student> course) {
//		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
//	}
//	
//	public static void registerCourseStudent(Course <? super Worker> course) {
//		System.out.println(course.getName() + "수강생 : " + Arrays.toString(course.getStudents()));
//	}
//	
//	public static void main(String[] args) {
//		
//		Course<Person> personCourse = new Course<Person>("일반인 과정",5);
//		personCourse.add(new Person("일반인"));
//		personCourse.add(new Person("직장인"));
//		personCourse.add(new Person("학생"));
//		personCourse.add(new Person("고등학생"));
//		
//		Course<Worker> workerCourse = new Course<Worker>("직장인과정",5);
//		workerCourse.add(new Worker("직장인"));
//		
//		Course<Student> studentCourse = new Course<Student>("학생과정",5);
//		studentCourse.add(new Student("학생"));
//		
//		Course<HighStudent> highstudentCourse = new Course<HighStudent>("고등학생과정",5);
//		highstudentCourse.add(new HighStudent("고등학생"));
//		
//		registerCourse(personCourse);
//		registerCourse(workerCourse);
//		registerCourse(studentCourse);
//		registerCourse(highstudentCourse);
//		System.out.println();
//		
//		registerCourseStudent(studentCourse);
//		registerCourseStudent(highstudentCourse);
//		System.out.println();
//		
//		registerCourseWorker(personCourse);
//		registerCourseWorker(workerCourse);
//		System.out.println();
//		
//		
//	}
//
//}
