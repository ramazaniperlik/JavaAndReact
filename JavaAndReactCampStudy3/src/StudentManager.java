public class StudentManager extends UserManager{
    void validate(Student student){
        if(student.getePosta()=="abc1234@gmail.com" && student.getpassword() =="123456"){
            System.out.println("Giriş başarılı "+student.getFirstName());
        }else{
            System.out.println("Hatalı giriş");
        }
    }

}
