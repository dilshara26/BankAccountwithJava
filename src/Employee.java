public class Employee extends Person {
    public String  position;
    public int salary;
    public Employee(String name, String birthdate, String address,String position, int salary){
        super(name,birthdate, address );
        this.position= position;
        this.salary = salary;
    }

    public void setRoughSalary(int salary){
        this.roughSalary = (int) (salary + (salary*0.2));

    }


}
