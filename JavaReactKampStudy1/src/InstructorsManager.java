public class InstructorsManager {
    public void add(Instructors instructors){
        System.out.println("Instructor eklendi: "+instructors.getFirstName());
    }
    public void delete(Instructors instructors){
        System.out.println("Instructor silindi: "+instructors.getFirstName());
    }
    public void multiAdd(Instructors[] instructors){
        for (Instructors instructor : instructors){
            add(instructor);
        }
    }
}
