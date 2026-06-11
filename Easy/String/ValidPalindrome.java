package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();

        int i=0;
        int j=s.length()-1;

        int c=0;

        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);

            System.out.println(c+"th iteration");
            System.out.println(c1+","+c2);
            c++;
            if(!Character.isLetterOrDigit(c1)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(c2)){
                j--;
                continue;
            }


            if(c1==c2){
                i++;
                j--;
            }else return false;
        }


        System.out.println(i+","+j);

        return true;
    }


    static void main() {
        System.out.println(new ValidPalindrome().isPalindrome("race a car"));
    }
}
