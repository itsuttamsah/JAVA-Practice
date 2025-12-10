//Qn.1 Write a program to find whether the alphabet is vowel or consonant using switch statement .
import java.util.Scanner;

class Vowel_Consonant
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        char lowerCh = Character.toLowerCase(ch);

        switch(lowerCh) {
            case 'a':
            case 'e':
            case 'i':
            case '0':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                if(lowerCh >= 'a' && lowerCh <= 'z')
                {
                    System.err.println(ch + " is a consonant.");
                }
                else
                {
                    System.err.println(ch + " is not an alphabet.");
                }
        }
        sc.close();
    }
}
