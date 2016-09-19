# new5
public class Solution {
    public ArrayList<String> anagrams(String[] strs) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(strs==null||strs.length==0) return new ArrayList<String>();
        Map<String,ArrayList<String>> dict=new HashMap<String,ArrayList<String>>();
        ArrayList<String> ret=new ArrayList<String>();
        for(int i=0;i<strs.length;i++){
            char[] temp=strs[i].toCharArray();
            Arrays.sort(temp);
            String s=new String(temp);
            ArrayList<String> cur;
            if(dict.get(s)==null) cur=new ArrayList<String>();
            else cur=dict.get(s);
            cur.add(strs[i]);
            dict.put(s,cur);
        }
        for(String cur:dict.keySet()){
            if(dict.get(cur).size()>1){
                for(int i=0;i<dict.get(cur).size();i++)
                    ret.add(dict.get(cur).get(i));
            }
        }
        return ret;
    }
}
