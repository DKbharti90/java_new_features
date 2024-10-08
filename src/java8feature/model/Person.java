package java8feature.model;

public class Person {

    private String city;
    private String state;
    private String name;

    public Person(String city, String state, String name) {
        this.city = city;
        this.state = state;
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
