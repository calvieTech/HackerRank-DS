public class Anagram {

    public static int[] charCount(String s) {
        int[] countingChars = new int[26];
        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            int codeForChar = (int) c - 'a';
            countingChars[codeForChar]++;
        }
        return countingChars;
    }

    public static int getDelta(int[] charCount1, int[] charCount2)  {
        if(charCount1.length != charCount2.length) {
            throw new RuntimeException("The two string inputs are NOT anagrams");
        }
        int delta = 0;
        for(int i = 0; i < charCount1.length; ++i) {
            int difference = Math.abs(charCount1[i] - charCount2[i]);
            delta += difference;
        }
        return delta;
    }
    public static int numberNeeded(String first, String second) {
        int[] charCount1 = charCount(first);
        int[] charCount2 = charCount(second);

        return getDelta(charCount1, charCount2);
    }
}
