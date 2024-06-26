package user;

public class User implements Human{
    private String name;
    private Integer age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    public void sysOut() {
        System.out.println("name:{" + name + "}; age:{" + age + "}");
    }
}
