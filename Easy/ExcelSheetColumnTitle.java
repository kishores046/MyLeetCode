class ExcelSheetColumnTitle {
    public String convertToTitle(int columnNumber) {
        
        
        int num=columnNumber;
        StringBuilder s=new StringBuilder("");
        while(num>0){
            num--;
            s.insert(0,(char)('A'+num%26));
            num/=26;
        }
        return s.toString();
    }
}