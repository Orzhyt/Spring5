package user;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sysOut() {
        System.out.println("name:{" + name + "}; age:{" + age + "}");
    }
}
