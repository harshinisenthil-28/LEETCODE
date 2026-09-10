class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String>list=new ArrayList<>();
        list.add(words[0]);
        int l=0;
        for(int i=1;i<groups.length;i++){
            if(groups[i]!=groups[l]){
                list.add(words[i]);
                l=i;
            }
        }
        return list;
    }
}