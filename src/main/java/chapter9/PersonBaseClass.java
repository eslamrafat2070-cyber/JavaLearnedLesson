package chapter9;

public class PersonBaseClass {


    private String name;
    private  int age;
    private   char gender;

    //create defult constructor
    public PersonBaseClass() {
      System.out.println("PersonBaseClass Constructor");
    }
    public  PersonBaseClass(String name)
    {
        System.out.println("Second Constructor with name parameter: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }



}
