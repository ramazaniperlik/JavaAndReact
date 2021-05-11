public class Student extends User {
    private String universityName;
    private String GNO;
    private String password;

    public Student() {}

    public Student(int id, String firstName, String lastName, String ePosta, String universityName, String GNO) {
        super(id, firstName, lastName, ePosta);
        this.universityName = universityName;
        this.GNO = GNO;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGNO() {
        return GNO;
    }

    public void setGNO(String GNO) {
        this.GNO = GNO;
    }
    public String getpassword() {
        return getpassword();
    }

}
