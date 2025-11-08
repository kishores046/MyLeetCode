public class ExcelSheetColumnNumber {
    static void main() {
        String columnTitle="ZZZZ";
        int num=0;
        for (int i = columnTitle.length()-1,j=0; i >=0 ; i--,j++) {
            char ch=columnTitle.charAt(i);
            num+=((ch-'A')+1)*(int)Math.pow(26,j);
        }
        System.out.println(num);

    }
}
