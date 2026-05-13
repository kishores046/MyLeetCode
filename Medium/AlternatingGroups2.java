
public class AlternatingGroups2{
	public int numberOfAlternatingGroups(int[] colors, int k) {
		int n=colors.length;
		int[] tempColors=new int[n+n];
		System.arraycopy(colors,0,tempColors,0,n);
		System.arraycopy(colors,0,tempColors,n,n);
		int res=0,countAlt=0;
		for(int i=1;i<k;i++){
			if(tempColors[i-1]!=tempColors[i])countAlt++;
		}
		if(countAlt==k-1) res+=1;

		for(int right=k;right<n+k-1;right++){
			int left=right-k+1;
			if(tempColors[left]!=tempColors[left-1]) countAlt--;
			if(tempColors[right]!=tempColors[right-1]) countAlt++;

			if(countAlt==k-1) res+=1;
		}
		return res;
	}
}
