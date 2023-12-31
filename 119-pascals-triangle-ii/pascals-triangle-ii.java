class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> pascalTriangle=new ArrayList<>();

        for(int i=0;i<=rowIndex;i++){
            List<Integer> currentRow=new ArrayList<>();

            currentRow.add(1);
            if(i>0){
                List<Integer> previousRow=pascalTriangle.get(i-1);
                for(int j=1;j<previousRow.size();j++){
                    int sum=previousRow.get(j)+previousRow.get(j-1);
                    currentRow.add(sum);
                }
                currentRow.add(1);
            }
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle.get(rowIndex);
    }
}