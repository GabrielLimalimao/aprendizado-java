
import java.util.Scanner;

public class Numeros {
    /**
     * Demonstração de exercico inciante/intermediário
     *
     */
    public static void main(String[] args){

        int linha = 5, coluna = 9;
  int lerlinha = 0;
        while(lerlinha < linha ){
            int lercoluna = 1;
            int guardavalor = 0;
            int valordalinha = 0 ;
            int contavalor = 1 ;

        if(lerlinha == 0){

            while (lercoluna <= coluna ){
                guardavalor = lercoluna;
                System.out.print(" "+guardavalor+"");
                lercoluna++;

            }
            System.out.println(" ");
        } else if ( lerlinha !=0){

            valordalinha = lerlinha;

            for (int linhasvar = 1 ;  linhasvar <= coluna; linhasvar++ , contavalor++ ){

                if (linhasvar <= valordalinha) {
                    System.out.print(" * ");

                }  else if (linhasvar > coluna- valordalinha  ){
                    System.out.print(" * ");
                }

                else {
                    System.out.print(contavalor + " ");
                }


            }
           System.out.println("");

        }
            lerlinha++;
        }

        }

    }

