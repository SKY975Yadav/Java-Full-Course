public class CWH_CH7_33_varargs {
    static void sum(int ...nums){
        int sum1 =0;
        for(int i =0;i< nums.length;i++){
            sum1 += nums[i];
        }
        System.out.println(sum1);
    }
    public static void main(String[] args) {
        sum(3,4,2,3,34);
    }
}
