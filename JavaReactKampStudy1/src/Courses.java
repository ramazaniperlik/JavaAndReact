import java.util.Date;

public class Courses {
    private int _id;
    private String _name;
    private String _startDate;
    private String _courseTime;

    public Courses(){}

    public Courses(int id,String name,String startDate,String courseTime){
        _id = id;
        _name = name;
        _startDate = startDate;
        _courseTime = courseTime;
    }

    public int get_id() {
        return _id;
    }
    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }
    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_startDate() {
        return _startDate;
    }
    public void set_startDate(String _startDate) {
        this._startDate = _startDate;
    }

    public String get_courseTime() {
        return _courseTime;
    }
    public void set_courseTime(String _courseTime) {
        this._courseTime = _courseTime;
    }
}
