package functional;

public class Customer {
    private String id;
    private String location;
    private Gender gender;
    private int age;

    public Customer(String id, String location, Gender gender, int age) {
        this.id = id;
        this.location = location;
        this.gender = gender;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public Customer setId(String id) {
        this.id = id;
        return this;
    }

    public String getLocation() {
        return location;
    }

    public Customer setLocation(String location) {
        this.location = location;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Customer setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Customer setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append(id).append(" : ").
          append(location).append(" : ").
          append(gender).append(" : ").
          append(age).toString();
    }

}

