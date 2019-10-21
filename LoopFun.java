 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer output = 1;
          for (Integer i = 1 ; i<=number ; i++)
          {
              output = output * i;
          }
            
          return output;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
        String[] sentenceArray = phrase.split("\\s");
        //String lastword = sentenceArray[sentenceArray.length-1];
        
        String acr = "";
        
        for (int i=0 ; i< sentenceArray.length ; i++)
        {
            acr = acr + sentenceArray[i].charAt(0);
        }
        return acr.toUpperCase();
          
          
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) 
      {
          //char[] oldChar = word.toCharArray();
          //char[] newChar = new Char[oldChar.length];
          Integer shiftValue = 3;
          String newString = "";
           for (char c:word.toCharArray())
           {
               if ((char)c == 'x')
                    newString += 'a';
               else if ((char)c == 'y')
                    newString += 'b';
               else if ((char)c == 'z')
                    newString += 'c';
               else
                    newString += (char)(c+shiftValue);
           }
          
          
          /*Integer wordLength = word.length() ;
          for (Integer i = 0 ; i<= wordLength ; i++)
          {
              Integer charValuetobeReplaced = word.charValue(i);
          }
            */
          return newString;
      }
}
