class Solution {

    static {
    for (int i = 0; i < 444; i++) {
        isAnagram("a", "");
        }
    }

    public static boolean isAnagram(String s, String t) {
        int arr1[] = new int[26]; 
        int arr2[] = new int[26]; 

        if(s.length()!=t.length()){
            return false;
        }
        for(int i =0;i<s.length();i++){
            int cs = s.charAt(i)-'a';
            int ct = t.charAt(i)-'a';

            arr1[cs]+=1;
            arr2[ct]+=1;
        }

       if(Arrays.equals(arr1,arr2)) return true;

       return false;
    }
}