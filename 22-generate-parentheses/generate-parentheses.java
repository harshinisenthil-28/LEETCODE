class Solution {
    public void gen(int open,int close,int n,String ans,List<String> op){
        if(ans.length()==2*n){
            op.add(ans);
            return;
        }
        if(open<n){
            gen(open+1,close,n,ans+"(",op);
        }
        if(close<open){
            gen(open,close+1,n,ans+")",op);
        }

    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> op=new ArrayList<>();
        String ans="";
        gen(0,0,n,ans,op);
        return op;
    }
}