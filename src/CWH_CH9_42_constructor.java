class mainEmployee {
    private int id = 10;
    private String name = "ramu";
    float sm;

    public int getId() {
        return id ;
    }

    public void setId(int i) {
        id = i;
    }

    public String getName() {
        return name ;
    }

    public void setName(String n) {
        name = n;
    }
    public mainEmployee(int i,String n){
        id =i;
        name = n;
        System.out.println(i+"\n" +n);
    }
}

public class CWH_CH9_42_constructor {
    public static void main(String[] args) {
        mainEmployee emp = new mainEmployee(32,"sai krishna");
        //System.out.println(emp.getId());
        //System.out.println(emp.getName());
    }
}
