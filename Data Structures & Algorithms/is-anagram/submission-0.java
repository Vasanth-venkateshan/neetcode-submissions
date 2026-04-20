class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }

    

       HashMap<Character,Integer> Counts= new HashMap<>();
       HashMap<Character,Integer> Countt= new HashMap<>();

       for(int i=0;i<s.length();i++)
       {
            Counts.put(s.charAt(i),Counts.getOrDefault(s.charAt(i),0)+1);
            Countt.put(t.charAt(i),Countt.getOrDefault(t.charAt(i),0)+1);
       }
       return Counts.equals(Countt);
    }
}

