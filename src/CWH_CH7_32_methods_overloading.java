public class CWH_CH7_32_methods_overloading {
    static void array(){
        System.out.println("Good Morning ");
    }
    static void array(int s[]){
        s[0] = 96;
        int m = s[0];
        System.out.println("Good Morning "+m+" times");
       // return m;
    }
    static void array(int a ,int s[],int b,int c){
        System.out.println("Good Morning "+s[0]+" times");
    }
    static void array(int a ,int s[],int b,int c,int d){
        System.out.println("Good Morning "+s[0]+" times");
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int s =10;
       // System.out.println(array(arr));
        //System.out.println(arr[0]);
        array();
        array(arr);
        array(s,arr,4,5);
        array(s,arr,4,5,6);
        System.out.println();
    }
}
