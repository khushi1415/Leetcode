class Solution {
public int mostWordsFound(String[] sentences) {
int maxWords = 0;
//For loop is used for traversing the array
for(String sentence : sentences)
{
//words is working as a splitting total no of words
String[] words = sentence.split(" ");

        //numWords is calculating total no. of words
        int numWords = words.length;
        
        //if part of Ex 1
        // numWords > maxWords     5 > 0  update maxWords = numWords  max = 5
        // 4 > 5 condition not true
        // 6 > 5 condition true 5 is replacing with 6
        
        if(numWords > maxWords){
            maxWords = numWords;
        }
    }
    
    //Then returning maxWords = 6
    return maxWords;
}
}