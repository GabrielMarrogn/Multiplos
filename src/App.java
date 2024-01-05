import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int resto = 0;
        sc.close();

        if(a > b){
            resto = a % b;
            if(resto == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }else{
            resto = b % a;
            if(resto == 0){
                System.out.println("Sao Multiplos");
            }else{
                System.out.println("Nao sao Multiplos");
            }
        }

    }
}
