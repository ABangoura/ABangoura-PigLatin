
public class PigLatin {
    /**
     * Pig latin works as follows: every word has its first character moved to the end, and 'ay' is added to the end of the
     * word.
     *
     *     example:
     *     word = ordway
     *     pig = igpay
     *     latin = atinlay
     *
     * Take in a word and return the pig latin form. You will need to use the substring method of String to break
     * up the string.
     * String docs: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
     *
     * @param in A string.
     * @return the pig latin form of in.
     */
    public String returnPigLatin(String in){
        // Get the first character in the string.
        char firstCharacter = in.charAt(0);

        // Save the rest of the string as a substring.
        String subString = in.substring(1, in.length());

        // The pig latin ending.
        String ending = "ay";

        // Concatenate all 3 sections to form the pig latin word
        // and return the result.
        return subString + firstCharacter + ending;
    }
}
