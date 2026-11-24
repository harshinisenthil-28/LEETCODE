class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
       paragraph=paragraph.toLowerCase();
       String[] arr=paragraph.split("[^a-z]+");
       HashMap<String,Integer> map=new HashMap<>();
       HashSet<String> set=new HashSet<>();
       for(int i=0;i<banned.length;i++){
        set.add(banned[i]);
       }
       for(int i=0;i<arr.length;i++){
        if(!set.contains(arr[i])){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
       }
        String ans="";
        int max=0;
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                ans=entry.getKey();
            }
        }
        return ans;
    }
}