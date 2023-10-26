class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs=new HashSet<>();
        int i=0,count=0;
        while(i<s.length()){
            char c=s.charAt(i);
            if(hs.add(c)){
                i++;
            }
            else{
                count++;
                hs.clear();
                hs.add(c);
                i++;
            }
        }
        return count+1;
    }
}