class ExcelSheetNumberConv{
    public static void main(String args[]){
        int num=701;
        StringBuilder s=new StringBuilder("");
        while(num>0){
            num--;
            s.insert(0,(char)('A'+num%26));
            num/=26;
        }
        System.out.println(s);
    }
}