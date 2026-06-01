package BinarySearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TheKWeakestRowsInMatrix {

    public int[] kWeakestRows(int[][] mat,int k){

        Queue<Pair> queue=new PriorityQueue<>(( a, b)->{
            if(a.total!=b.total){
                return Integer.compare(b.total,a.total);
            } return Integer.compare(b.row,a.row);
        });

        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            int total=0;
            int left=0,right=n;
            while (left<right){
                int mid=left+(right-left)/2;
                if(mat[i][mid]==1)left=mid+1;
                else right=mid;
            }
            total=left;
            queue.offer(new Pair(total,i));
            while(queue.size()>k){
                queue.poll();
            }
        }

        int[] res=new int[k];
       for(int i=k-1;i>=0;i--){
           res[i]=queue.poll().row;
       }

        return res;
    }

    static void main() {
        System.out.println(Arrays.toString(new TheKWeakestRowsInMatrix().kWeakestRows(new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}},3)));
    }

    class Pair{
        int row;
        int total;

        @Override
        public String toString() {
            return "Pair{" +
                    "row=" + row +
                    ", total=" + total +
                    '}';
        }

        public Pair(int total, int row) {
            this.total = total;
            this.row = row;
        }
    }
}
