
public class CWH_85_finally {
    public static double area(int r)throws NegativeRadiusException
    {
        if(r<0) {
            throw  new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }
    public static int greet(){
        try {
            int a = 50;
            int b = 0;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("End of program");
        }
        return  -1;
    }
    public static void main(String[] args)
    {
        System.out.println(greet());
    }
}
