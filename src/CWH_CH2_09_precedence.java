public class CWH_CH2_09_precedence {
    public static void main(String[] args) {
      /*  int a = 23;
        // if +,- = left to right
        // if *,/ = left to right
        // if ++ = right to left
        //first multiplication  and division then addition or subtraction
        int b = 10;
        int c ;
        c = b*=33+10/5;//here the operator start from right tp left

        int x=20,y=10,z;
        z= (x-y)/2;
        System.out.println(z); */
        float a =5,b =1,c=4;
        float d = (b*b - 4*a*c)/(2*a);
        System.out.println(d);
    }
}
