public class Instructor extends User{
    private String gradutedYear;
    private String gruatedDegree;
    private String experienceYear;
    private String password;

    public Instructor(){}

    public Instructor(int id, String firstName, String lastName, String ePosta, String gradutedYear, String gruatedDegree, String experienceYear) {
        super(id, firstName, lastName, ePosta);
        this.gradutedYear = gradutedYear;
        this.gruatedDegree = gruatedDegree;
        this.experienceYear = experienceYear;
    }

    public String getGradutedYear() {
        return gradutedYear;
    }

    public void setGradutedYear(String gradutedYear) {
        this.gradutedYear = gradutedYear;
    }

    public String getGruatedDegree() {
        return gruatedDegree;
    }

    public void setGruatedDegree(String gruatedDegree) {
        this.gruatedDegree = gruatedDegree;
    }

    public String getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(String experienceYear) {
        this.experienceYear = experienceYear;
    }
    public String getPassword() {
        return getPassword();
    }
}
