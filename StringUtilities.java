
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String output = baseValue + valueToBeAdded;
        return output;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        String output = "";
        int strLength = valueToBeReversed.length();
        for (int i = strLength-1; i>=0 ; i--)
        {
           output = output + valueToBeReversed.charAt(i); 
        }
        
        return output;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        
        Character output;
        int strMidLength = word.length()/2;
        output = word.charAt(strMidLength);
        
        return output;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        String output = value.replace(charToRemove.toString(), "");
        //StringBuilder sb = new StringBuilder(value);
        //sb.deleteCharAt(charToRemove);
        //return sb.toString();
        return output;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String[] sentenceArray = sentence.split("\\s");
        String lastword = sentenceArray[sentenceArray.length-1];
        return lastword;
    }
}
