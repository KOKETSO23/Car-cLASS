public class car {
    String _name, _model;

    int _year;

    public void set_name(String name) {
        _name = name;
    }

    public String get_name() {
        return _name;
    }

    public void set_model(String model) {
        _model = model;
    }

    public String get_model(){
        return _model;
    }

    public void set_year(int year) {
        _year = year;
    }
    public int get_year() {
        return _year;
    }

    public void drive(){
        System.out.println("the car is being driven");



    }
}
