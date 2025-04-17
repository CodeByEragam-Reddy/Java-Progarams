import java.util.Scanner;
// 
class Program2
{
    public static void main(String[] args){
        // create 2 char variables
        char ch1,ch2;
        // /reada characters
        Scanner s=new Scanner(Syatem.in);
        ch1 = s.next().charAt(0);
        ch2 = s.next().charAt(0);
        // logic to print smallest ASCII
        if(ch1<ch2)
        {
            System.out.println(ch1);
        }
        else
        {
            System.out.println(ch2);
        }
    }
}