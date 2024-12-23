class Employee{
    int id;
    String name;
    int salary;
    public void printing_details(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
    }
    public int get_salary(){
        return salary;
    }
    public void inc_salary(){
        System.out.println("Salary before increment " + salary);
        salary+=5000;
        System.out.println("Salary increased by 5000, Now your salary is : "+salary);
    }
        }
public class CWH_CH8_38_custom_class {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id =14;
        emp1.name = "Sai krishna";
        emp1.salary = 20000;
        emp1.printing_details();
        //System.out.println("Salary = "+emp1.get_salary());
        emp1.inc_salary();
    }

}
