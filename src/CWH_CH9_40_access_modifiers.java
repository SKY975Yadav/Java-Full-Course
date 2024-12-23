class MyEmployee{
    private  int id ;
    private String name;
    float sm;
    public int getId(){
        return id;
    }
    public  void setId(int i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public  float setId(float b){
        return b;
    }

    public float getSm() {
       return sm;
    }
}
   //not mandatory
class circle{
    private float radius;
    private  float area;
    private float circumference;

    public float getRadius() {
        return radius;
    }
    public void setRadius(float r){
        radius =r;
    }

    public float getArea() {
        return area;
    }
    public void setArea(float ar){
       float s = 3.14f*radius*radius;
        if (s!=ar){
            System.out.println("Entered wrong area!");
        }
    }
}
public class CWH_CH9_40_access_modifiers {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        emp1.setId(45);
        System.out.println(emp1.getId());
        emp1.setName("Sai krishna");
        System.out.println(emp1.getName());
        //not mandatory
        circle ci = new circle();
        ci.setRadius(10);
        System.out.println(ci.getRadius());
        ci.setArea(14);
        System.out.println( ci.getArea());
        emp1.setId(3);
        System.out.println(emp1.getId());
        System.out.println(emp1.getSm());
    }
}
