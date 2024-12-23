public class CWH_CH7_31_java_methods {
    public int ADD(int x , int y){
        int z ;
        z = x+y;
        return z;
    }
    public static void main(String[] args) {
        CWH_CH7_31_java_methods obj = new CWH_CH7_31_java_methods();
        int a = obj.ADD(3,6);
        int z = obj.ADD(6,34);
        //int a = ADD(3,4);
        //int b = ADD(8,10);=
        System.out.println((a)+" "+(z));
    }
}
