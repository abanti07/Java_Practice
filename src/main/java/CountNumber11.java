//Count number of words, number of characters without spaces, number of vowels and consonant from
// the given string:I am a SQA Engineer

public class CountNumber11 {
    public static void main(String[] args) {
        String str = "I am a SQA engineer";
        countwords(str);
        CountChar(str);
        VowelConsonant(str);
    }

    public static void countwords(String str) {
        String[] words = str.split("\\s");
        int count = words.length;
        System.out.println("Words:" + count);
    }

    public static void CountChar(String str) {
        char[] ch = str.toCharArray();
        int chars = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                chars++;
            }
        }
        System.out.println("Chars:" + chars);
    }

    public static void VowelConsonant(String str) {

        str = str.toLowerCase();

        int vowelcount = 0;
        int consonantcount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelcount++;
                } else {
                    consonantcount++;
                }
            }
        }
        System.out.println("Vowel:" + vowelcount);
        System.out.println("Consonant:" + consonantcount);
    }
}
