class Solution {
   public boolean wordPattern(String pattern, String s) {
   	String [] words = s.split(" ");
       if(pattern.length() != words.length ) 
           return false;

       Map<Character, String> map = new HashMap<>();
       for(int i=0;i<words.length;i++){
           String word = words[i];
           Character ch = pattern.charAt(i);
           
           if((map.containsKey(ch) && !map.get(ch).equals(word)) || 
               (!map.containsKey(ch) && map.containsValue(word))){
               return false;
           }    

           map.put(ch, word);
       }

       return true;
   }
}