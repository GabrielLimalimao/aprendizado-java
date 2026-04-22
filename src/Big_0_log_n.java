import java.util.Scanner;


public class Big_0_log_n {
//Exemplo de busca Binária realizado em java, em um vetor

    public static void main (String[] args ) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número");
        int x = sc.nextInt();

 BIg_0(x);


    }
    public static void BIg_0(int valorpassado){

        int [] valores = {1,2,3,4,5,6};
        int valore = valorpassado;

        int valforfinal = valores.length -1 ;
        int media =0 ;
        int contador =0 ;
        int inicio =0;
        while (true ){

            if (valores[media]== valore){
                System.out.println("o valor esta na posicao: " + media);
                System.out.println(contador);
                break;
            } else if (valores[media] != valore) {
                media = (inicio + valforfinal  ) / 2;

                if (valores[media] < valore ) {

                    inicio = media + 1;
                } else if (valores[media] > valore){
                    valforfinal = valforfinal - 1;

                }
                contador++;



            }
            }
        }

    }

