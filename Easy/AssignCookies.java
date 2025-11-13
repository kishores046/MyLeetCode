import java.util.Arrays;

public class AssignCookies {
    static void main() {
        int[] g={1,2};
        int[] s={1,2,3};
        int i=0,j=0;
        int res=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if (s[j]>=g[i]){
                i++;
                res++;
            }else {
                j++;
            }
        }
        System.out.println(res);

    }
}
