void main() {
    String a="AAAAAAAAA",b="AAACCC";
    System.out.println(gcdOfStrings(a,b));

}
public static int gcd(int a,int b){
    if(b==0)
        return a;
    return gcd(b,a%b);
}
public static String gcdOfStrings(String str1, String str2) {

    if (!(str1 + str2).equals(str2 + str1)) {
        return "";
    }
    int gcdLen = gcd(str1.length(), str2.length());


    return str1.substring(0, gcdLen);
}
