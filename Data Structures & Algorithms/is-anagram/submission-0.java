class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        } else {
            String[] sSplit = s.split("");
            String[] tSplit = t.split("");

            Arrays.sort(sSplit);
            Arrays.sort(tSplit);

            if(!Arrays.equals(sSplit, tSplit)){
                return false; 
            }
        }

        return true;

    }

}
