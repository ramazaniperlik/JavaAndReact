public class Main {

    public static void main(String[] args) {

        Courses course1 = new Courses();
        course1.set_id(1);
        course1.set_name("Java & React");
        course1.set_courseTime("70 saat");
        course1.set_startDate("01/04/2021");

        Courses course2 = new Courses();
        course2.set_id(2);
        course2.set_name("C# .Net Framework");
        course2.set_courseTime("70 saat");
        course2.set_startDate("01/04/2021");

        Instructors instructor1 = new Instructors();
        instructor1.setId(1);
        instructor1.setFirstName("Engin");
        instructor1.set_lastName("Demiroğ");
        instructor1.setAge("35");

        Instructors instructor2 = new Instructors();
        instructor2.setId(2);
        instructor2.setFirstName("Ramazan");
        instructor2.set_lastName("İperlik");
        instructor2.setAge("26");


        Courses[] course = {course1,course2};
        CoursesManager coursesManager = new CoursesManager();
        coursesManager.multiAdd(course);

        Instructors[] instructors={instructor1,instructor2};
        InstructorsManager instructorManager = new InstructorsManager();
        instructorManager.multiAdd(instructors);

    }
}
