import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero1 = terminal.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int numero2 = terminal.nextInt();
        try{
            contar(numero1, numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo numero deve ser maior que o primeiro");
        }
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1 > numero2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = numero2 - numero1;
            for(int i = 1 ; i < contagem; i++){
                System.out.println("Imprimindo numero: " + i);
            }
        }
    }
    static class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(){
            
        }
    }
}
