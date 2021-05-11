public class InstructorManager extends UserManager{
    public void validate(Instructor instructor){
        if(instructor.getePosta()=="abc123@gmail.com" && instructor.getPassword()=="12345"){
            System.out.println("Giriş yaptınız."+instructor.getFirstName());
        }else{
            System.out.println("Hatalı giriş");
        }
    }
}
