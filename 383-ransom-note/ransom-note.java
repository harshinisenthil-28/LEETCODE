class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap <Character,Integer> rmap=new HashMap<>();
        HashMap <Character,Integer> mmap=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            if(rmap.containsKey(ransomNote.charAt(i))){
                rmap.put(ransomNote.charAt(i),rmap.get(ransomNote.charAt(i))+1);
            }
            else{
                rmap.put(ransomNote.charAt(i),1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            if(mmap.containsKey(magazine.charAt(i))){
                mmap.put(magazine.charAt(i),mmap.get(magazine.charAt(i))+1);
            }
            else{
                mmap.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
    if(!mmap.containsKey(ransomNote.charAt(i)) || 
       rmap.get(ransomNote.charAt(i)) > mmap.get(ransomNote.charAt(i))){
        return false;
    }
}
        return true;
    }
}