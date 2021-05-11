public class CoursesManager {
    public void add(Courses course){
        System.out.println("Course eklendi: "+course.get_name());
    }
    public void delete(Courses course){
        System.out.println("Course silindi: "+course.get_name());
    }
    public void multiAdd(Courses[] courses){
        for (Courses course : courses){
            add(course);
        }
    }
}
