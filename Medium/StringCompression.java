import java.util.Arrays;

public class StringCompression {
    public String compressedString(String word){
        if (word.length() == 1) return 1 + "" + word.charAt(0);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char prev = ' ';
        char curr = ' ';
        for (int i = 0; i < word.length() - 1; i++) {
            prev = word.charAt(i);
            curr = word.charAt(i + 1);
            if (curr == prev) {
                if (count > 7) {
                    sb.append(count + 1).append(prev);
                    count = 0;
                } else count++;
            } else {
                sb.append(count + 1).append(prev);
                count = 0;
            }
        }
        return sb.append(count+1).append(curr).toString();
    }
    public int compressedString(char[] chars){
        int write=0;
        int read=0;
        while(read<chars.length){
            char curr=chars[read];
            int count=0;
            while(read<chars.length && chars[read]==curr){
                read++;
                count++;
            }
            chars[write++]=curr;
            if(count>1){
                for(char c:String.valueOf(count).toCharArray()){
                    chars[write++]=c;
                }
            }
        }
        return write;
    }
    static void main() {
        StringCompression obj=new StringCompression();
        System.out.println(obj.compressedString(new String("a").repeat(14).concat("bbb")));
        char[] chars={'a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','a','b','b','b'};
        int len=obj.compressedString(chars);
        System.out.println(Arrays.toString(chars)+"\t"+len);


    }
}
