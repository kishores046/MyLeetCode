public class CheckDigitsEqualInStringAfterOperations {
    public boolean hasSameDigits(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=1;

        while(sb.length()!=2){
            int t=(sb.charAt(i)-'0'+sb.charAt(j)-'0')%10;
            sb.setCharAt(i,Character.forDigit(t,10));
            if(i==sb.length()-2 && j==sb.length()-1){
                sb.deleteCharAt(sb.length()-1);
                i=0;
                j=i+1;
            }
           else{
               i++;
               j++;
            }

        }
        System.out.println(sb);
        return sb.charAt(0)==sb.charAt(1);
    }

    static void main() {
        CheckDigitsEqualInStringAfterOperations obj=new CheckDigitsEqualInStringAfterOperations();
        System.out.println(obj.hasSameDigits("3902"));
    }
}
