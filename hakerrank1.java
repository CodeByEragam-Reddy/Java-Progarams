import java.util.Scanner;
class Even {
// private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // if(n%2==1){
        //     System.out.println("Weird");
        // }
        // for(n=2; n>=5; n++ ){
        //     if(n%2==0){
        //         System.out.println("Not Weird");
        //     }
        // }
        // for(n=6; n>=20; n++){
        if(n%2==0){
             System.out.println("Weird");
        }
        // }
        if(n%2==0){
            if(n>20){
                System.out.println("weird");
            }
        }
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        // scanner.close();
    }
}
