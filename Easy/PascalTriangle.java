import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pasTriList=new ArrayList<>();
        List<Integer> prevList=null;
        List<Integer> newList=null;
        for(int i=1;i<=numRows;i++){
             newList=new ArrayList<>();
            for(int j=0,k=0;j<i;j++,k++){
                if(j==0 || j==i-1){
                    newList.add(j,1);
                    
                }
                else{
                    newList.add(prevList.get(k)+prevList.get(k-1));
                        
                }
            }
            pasTriList.add(newList);
            prevList=newList;
        }
        return pasTriList;
    }
}
