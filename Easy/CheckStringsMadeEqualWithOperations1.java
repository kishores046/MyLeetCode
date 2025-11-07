import java.util.Arrays;

public class CheckStringsMadeEqualWithOperations1 {
    public boolean canBeEqual(String s1, String s2) {
        int n=s1.length();
        char[] ao1=new char[n];
        char[] ao2=new char[n];
        char[] ae1=new char[n];
        char[] ae2=new char[n];
        for(int i=0,j=0;i<n-1;i+=2,j++){
            ao1[j]=s1.charAt(i);
            ao2[j]=s2.charAt(i);
        }
        for(int i=1,j=0;i<n;i+=2,j++){
            ae1[j]=s1.charAt(i);
            ae2[j]=s2.charAt(i);
        }

        Arrays.sort(ao1);
        Arrays.sort(ao2);
        Arrays.sort(ae1);
        Arrays.sort(ae2);

        return Arrays.equals(ao1,ao2) && Arrays.equals(ae2,ae1);
    }

    static void main() {
        CheckStringsMadeEqualWithOperations1 obj=new CheckStringsMadeEqualWithOperations1();
        System.out.println(obj.canBeEqual("ppmfd","pfdpm"));
    }
    void swap(char[] arr,char ch1,char ch2){
        arr[0]=ch2;
        arr[1]=ch1;
    }
}
