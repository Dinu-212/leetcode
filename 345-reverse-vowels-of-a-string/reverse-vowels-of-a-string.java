class Solution {
    public String reverseVowels(String s) {
        char[] charArray=s.toCharArray();
        String vowels="aeiouAEIOU";
        int start=0,end=s.length()-1;
        while(start<end){
            while(start<end && !vowels.contains(charArray[start]+"")){
                start++;
            }
            while(start<end && !vowels.contains(charArray[end]+"")){
                end--;
            }
            char temp=charArray[start];
            charArray[start]=charArray[end];
            charArray[end]=temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}