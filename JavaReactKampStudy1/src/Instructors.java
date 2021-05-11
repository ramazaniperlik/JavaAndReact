public class Instructors {
    private int _id;
    private String _firstName;
    private String _lastName;
    private String _age;

    public Instructors(){}

    public Instructors(int id,String firstName,String lastName,String age){
        _id = id;
        _firstName = firstName;
        _lastName = lastName;
        _age = age;
    }

    public int getId(){
        return _id;
    }
    public void setId(int id){
        _id = id;
    }

    public String getFirstName(){
        return _firstName;
    }
    public void setFirstName(String firstName){
        _firstName = firstName;
    }

    public String getLastName(){
        return  _lastName;
    }
    public void set_lastName(String lastName){
        _lastName = lastName;
    }

    public String getAge(){
        return _age;
    }
    public void setAge(String age){
        _age = age;
    }
}
