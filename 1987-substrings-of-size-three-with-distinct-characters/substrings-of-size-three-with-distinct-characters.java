class Solution {
    public int countGoodSubstrings(String s) {
        int c=0;
        int a=0;
        for(int i=0;i<s.length()-2;i++){
            HashSet<Character> set=new HashSet<>();
            c=0;
            for(int j=i;j<i+3;j++){
                
                if(set.contains(s.charAt(j))){
                    break;
                }
                else{
                    set.add(s.charAt(j));
                    c++;
                }
            }
            if(c==3){
                a++;
            }
            
        }
        return a;
    }
}