public class CWH_29_practice06 {
    public static void main(String[] args) {
        //problem1
//        float []arr = {10.25f,12.75f,5.5f,8.6f,9.4f};
//        float sum = 0;
//        for (int i = 0; i< arr.length;i++){
//            sum = sum+arr[i];
//        }
//        System.out.println(sum);
        //problem2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number u ant to check : ");
//        int a = sc.nextInt();
//        boolean say = false;
//        int i;
//        int []arr = {10,20,30,40,50,60,70,80,90,100};
//        for (i = 0;i< arr.length;i++){
//            if(arr[i]==a){
//                say = true;
//                //System.out.println("Integer is found at a location "+ i);
//                break;
//            }
//           //else {
//            //if(i == arr.length-1){
//                  // System.out.println("Integer not found");
//               // }
//           // }
//        }
//        if (say){
//            System.out.println("Integer is  found at location "+i);
//        }
//        else {
//            System.out.println("Integer not found");
//        }
        //problem3
//        Scanner sc = new Scanner(System.in);
//        double sum =0 ;
//        System.out.println("Enter the all students marks in physics : ");
//        double [] arr = new double[5] ;
//        for(int i = 0;i< arr.length;i++){
//            arr[i]  = sc.nextDouble();
//        }
//
//        for(byte i=0 ; i<5;i++){
//            System.out.println(arr[i]);
//        }
//        for (double v : arr) {
//            sum = sum + v;
//        }
//        System.out.println("Average = " +sum/5);
        //problem4
//        int [][] arr1 = {new int[]{22,33,44},new int[]{55,66,77}};
//        int [][] arr2 = {new int[]{22,33,44},new int[]{55,66,77}};
//        int [][] sum = new int[2][3];
//        for(int i = 0;i< arr1.length;i++){
//            for(int j =0;j<arr1[i].length;j++){
//                sum [i][j] = arr1[i][j]+arr2[i][j];
//            }
//        }
//        System.out.println("The sum of two matrices is : ");
//        for (int k = 0;k< sum.length;k++){
//            for (int l =0;l<sum[k].length;l++){
//                System.out.print(sum[k][l]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
        //problem5
//        int [] arr ={20,34,67,85,73,10};
//        System.out.println("Elements Normally : ");
//        for (int element : arr){
//            System.out.print(element + " ");
//        }
//        int n = Math.floorDiv(arr.length,2);
//        int l = arr.length;
//        int temp=0 ;
//        for(int i=0;i<n;i++){
//            temp = arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1] =temp;
//        }
//        System.out.println("\nElements after Reverse : ");
//        for (int element : arr){
//            System.out.print(element + " ");
//        }

        //problem6
//        int [] arr ={20,34,67,85,73,10};
//        int a = Integer.MIN_VALUE;
//        for (int i =0;i<arr.length;i++){
//            if (arr[i]>a){
//                a=arr[i];
//            }
//        }
//        System.out.println("The maximum number is : "+a);
        //problem7
//        int [] arr ={20,34,7,85,73,10};
//        int a = Integer.MAX_VALUE;
//        for (int i =0;i<arr.length;i++){
//            if (arr[i]<a){
//                a=arr[i];
//            }
//        }
//        System.out.println("The minimum number is : "+a);
        //problem8
       /* int [] arr ={2,3,77,8,13,15};
        boolean bol = true;
        for (int i =0;i< arr.length-1;i++){
            if (arr[i] > arr[i+1]) {
                bol = false;
                break;
            };
        }
        if (bol){
            System.out.println("Array is sorted ");
        }
        else {
            System.out.println("Array is not sorted ");
        } */
    }
}
