class Solution {
    public int titleToNumber(String col) {
        int result=0;
        for(int i=0;i<col.length();i++){
            result*=26;
            result+=col.charAt(i)-'A'+1;
        }
        return result;
    }
}