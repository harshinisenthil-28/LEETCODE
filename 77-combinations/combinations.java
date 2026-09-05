class Solution {
    public void comb(int start,int n,int k,List<List<Integer>> ans,ArrayList<Integer> arr){
        if(arr.size()==k){
            ans.add(new ArrayList(arr));
            return;
        }
        for(int i=start;i<=n;i++){
            arr.add(i);
            comb(i+1,n,k,ans,arr);
            arr.remove(arr.size()-1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> ans=new ArrayList<>();
        comb(1,n,k,ans,new ArrayList<>());
        return ans;
    }
}