/**
 * Created by Admin on 27.06.2016.
 */
public class BinaryNumerOrNot {

    public static void main(String[] args) {
     int input = 100118;
        isBinaryOrNot(input);
        System.out.println(binOrNot(input));
    }


    static boolean binOrNot(int input){
        int copyOfInput = input;
        boolean isBinary = true;

        while(copyOfInput != 0){
            int holder = copyOfInput%10;
            if(holder > 1 ){
                isBinary = false;
                break;
            }else{
                copyOfInput = copyOfInput/10;

            }
        }

        return isBinary;
    }



    static void isBinaryOrNot(int number)
    {
        boolean isBinary = true;

        int copyOfNumber = number;

        while (copyOfNumber != 0)
        {
            int temp = copyOfNumber%10;   //Gives last digit of the number

            if(temp > 1)
            {
                isBinary = false;
                break;
            }
            else
            {
                copyOfNumber = copyOfNumber/10;    //Removes last digit from the number
            }
        }

        if (isBinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
    }
}
