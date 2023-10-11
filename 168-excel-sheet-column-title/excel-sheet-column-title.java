class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        while(columnNumber>0){
            columnNumber--;
            int val=columnNumber%26;
            val+=65;
            res=((char)val+"")+""+res;
            columnNumber/=26;
        }
        return res;

    }
}