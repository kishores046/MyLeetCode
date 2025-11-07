import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        List<StringBuilder> result=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            result.add(new StringBuilder());
        }
        int curRow=0;
        boolean goingDown=false;
        for(char c:s.toCharArray()){
            result.get(curRow).append(c);
            if (curRow==0 || curRow==numRows-1){
                goingDown=!goingDown;
            }
            curRow+=goingDown?1:-1;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder sb:result){
            res.append(sb);
        }
        return res.toString();

    }


    static void main() {
        ZigZagConversion obj=new ZigZagConversion();
        System.out.println(obj.convert("PAYPALISHIRING",4));
    }
}
