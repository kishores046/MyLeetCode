import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o','!','p','r','o','g','r','a','m','m','e','r','s'};
        for(int i=s.length-1,j=0;i>=s.length/2;i--,j++){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        System.out.println(Arrays.toString(s));
    }
}
