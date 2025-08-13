
class Solution {
    public String intToRoman(int num) {
        int ones=0;
        int  tens=0;
        int  hundreds=0;
        int  thousand=0;
		ones=num%10;
		tens=(num/10)%10;
		hundreds=(num/100)%10;
		thousand=num/1000;
		StringBuilder roman=new StringBuilder();
		roman.append("M".repeat(thousand));
		roman.append(convertToRoman(hundreds,"C","D","M"));
		roman.append(convertToRoman(tens,"X","L","C"));
		roman.append(convertToRoman(ones,"I","V","X"));
        return roman.toString();
    }
    public static String convertToRoman(int digit,String one,String five,String ten){
		if(digit<=3){
			return one.repeat(digit);
		}
		else if(digit ==9){
			return one+ten;
		}
	    else if(digit==4){
	    	return one+five;
	    }
	    else{
	    	return five+one.repeat(digit-5);
	    }
	}
}
