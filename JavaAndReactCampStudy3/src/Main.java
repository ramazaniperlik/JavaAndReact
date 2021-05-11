public class Main {

    public static void main(String[] args) {
	Student students1 = new Student(1,"Ramazan","İperlik","abc@gmail.com","Trakya Üniversitesi","3.0");
	Student students2 = new Student(2,"Mehmet","Polat","mehmet@gmail.com","Ege Üniversitesi","2.5");

	Instructor instructor1 = new Instructor(1,"Engin","Demiroğ","engin@gmail.com","2010","3.0","10");
    Instructor instructor2 = new Instructor(2,"Ahmet","Solmaz","ahmet@gmail.com","2002","2.5","5");

    Instructor[] instructors = {instructor1,instructor2};
    Student[] students ={students1,students2};

    InstructorManager instructorManager = new InstructorManager();
    instructorManager.multiAdd(instructors);
    instructorManager.validate(instructor1);

    StudentManager studentManager = new StudentManager();
    studentManager.multiAdd(students);
    studentManager.validate(students2);
    }
}
