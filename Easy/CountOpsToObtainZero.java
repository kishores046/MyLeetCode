public class CountOpsToObtainZero {
    static void main() {
        int num1=2,num2=3;
       //beats 100% Optimized Approach
        int res=0;
        while(num1!=0 && num2!=0){
            res+=num1/num2;
            num1%=num2;
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println(res);

    }
}
/* Beats 90%
   num1==num2 return 1;
   if num1==0==num2 return 0;
   int res=0;
   while(num1!=0 && num2!=0){
      res+=num1/num2;
      num1%=num2;
      int temp=num1;
      num1=num2;
      num2=temp;
     }
     sysout(res); or return res;
 */