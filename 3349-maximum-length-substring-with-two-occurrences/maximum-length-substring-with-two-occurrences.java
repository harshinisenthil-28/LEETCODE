class Solution {
    public int maximumLengthSubstring(String s) {
      int i=0;
      int maxi=0;
      while(i<s.length()){
        HashMap<Character,Integer> map=new HashMap<>();
        String word="";
        for(int k=i;k<s.length();k++){
            if(map.containsKey(s.charAt(k)) && map.get(s.charAt(k))<2){
                map.put(s.charAt(k),map.get(s.charAt(k))+1);
                word+=s.charAt(k);
            }
            else if(!map.containsKey(s.charAt(k))){
                map.put(s.charAt(k),1);
                word+=s.charAt(k);
            }
            else{
                break;
            }
            maxi=Math.max(maxi,word.length());
        }
        i++;
      } 
      return maxi; 
    }
}