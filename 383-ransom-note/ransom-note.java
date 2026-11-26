class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer> rmap=new HashMap<>();
        HashMap<Character,Integer> mmap=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            rmap.put(ransomNote.charAt(i),rmap.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mmap.put(magazine.charAt(i),mmap.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry:rmap.entrySet()){
            if(entry.getValue()>mmap.getOrDefault(entry.getKey(),0)){
                return false;
            }
        }
        return true;
    }
}