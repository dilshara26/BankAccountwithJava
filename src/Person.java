public class Person {
    public String name;
    public  String birthdate;
    public String address;

    public int roughSalary = 0;
    public Person(String name, String birthdate, String address){
        this.name = name;
        this.address = address;
        this.birthdate = birthdate;
    }
    public void makeBirthdayWish(){
        System.out.println("Happy Birthday "+ this.name);
    }

    public void setRoughSalary(int salary){
        this.roughSalary = salary;
    }
    public int getRoughSalary(){
        return this.roughSalary;
    }
}
