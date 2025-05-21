package recursion;

public class factorial {
    public static int calFactorial(int num){

        if(num==1 || num==0){
            return 1;
        }
       int fact_nm1= calFactorial(num-1);
       int fact_n=fact_nm1*num;
       return fact_n;
    }
    public static void main(String args[]){
        int num=5;
        int ans=calFactorial(num);
        System.out.println(ans);
    }
    
}
