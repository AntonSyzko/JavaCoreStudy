package StringsExercises;

/**
 * Created by Admin on 27.07.2016.
 * Java Program To Find The Percentage Of Uppercase Letters, Lowercase Letters, Digits And Other Special Characters In A String :
 */
public class CharatctersOperations {
    public static void main(String[] args) {
        String a = "Aa5 ";
        getCharsPercentage(a);
    }

    public static void  getCharsPercentage(String input){
        int upperCasecounter = 0;
        int resUperPercent = 0;
        int lowerCaseCounter = 0;
        int resLowerPercent = 0;

        int digitsCounter = 0;
        int digitspercent = 0;
        int whitespacesCounter = 0;
        int whitespacesPercent = 0;
        int othersCounter = 0;
        int othersPercent = 0;

        for(int i = 0; i<input.length();i++){
            char current = input.charAt(i);
            if(Character.isUpperCase(current)){
                upperCasecounter ++;
            }else if(Character.isLowerCase(current)){
                lowerCaseCounter ++;
            }else if(Character.isDigit(current)){
                digitsCounter ++;
            }else if(Character.isWhitespace(current)){
                whitespacesCounter ++;
            }
            else{
                othersCounter ++;
            }
        }

        resUperPercent = (upperCasecounter * 100)/input.length();
        System.out.println(" uppercase letters are " + resUperPercent);

        resLowerPercent = (lowerCaseCounter * 100)/input.length();
        System.out.println(" lower letters are " + resLowerPercent);

        digitspercent = (digitsCounter * 100)/input.length();
        System.out.println(" digits letters are " + digitspercent);

        whitespacesPercent = (whitespacesCounter * 100)/input.length();
        System.out.println(" whitespaces letters are " + whitespacesPercent);

        othersPercent = (othersCounter * 100)/input.length();
        System.out.println(" others letters are " + othersPercent);
    }
}
