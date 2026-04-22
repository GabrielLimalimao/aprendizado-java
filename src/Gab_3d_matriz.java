
import java.util.Scanner;

public class Gab_3d_matriz {
/*
*
* Demostração da representação de uma matriz de 3  dimensões

* */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int linha , coluna , volume;

        int valor1, valor2, valor3;
        System.out.println("Digite um valor para linha ");
        linha = sc.nextInt();

        System.out.println("Digigte o valor da coluna ");
        coluna = sc.nextInt();

        System.out.println("Digite o valor do volume ");
        volume = sc.nextInt();
        int [][][] vet = new int[linha][coluna][volume];
        int guardavalor = 0 ;
        int [][] [] verificar = Valores.valorss(vet);


        System.out.println("informe o valor de entrada da posicao x ");
        valor1 = sc.nextInt();
        System.out.println("informe o valor de entrada da posicao y ");
        valor2 = sc.nextInt();
        System.out.println("informe o valor de entrada da posicao z ");
        valor3 = sc.nextInt();

        System.out.println("O valor encontrado e: [" + verificar[valor1][valor2][valor3]+ " ] \n");

    }
    public class Valores {
        public static  int [][][] valorss(int [][][] valor ){
            int guardavalorrdelinha = valor.length;
            int guardarvalocolunasss = valor[0].length;
            int guardavalorrvolume = valor[0][0].length;


            for (int valordalisnhas = 0; valordalisnhas < guardavalorrdelinha ;valordalisnhas++){
                for (int valordascolunass = 0;  valordascolunass < guardarvalocolunasss;valordascolunass++ ) {
                    for(int valoresVolumessss = 0, num = 0 ; valoresVolumessss < guardavalorrvolume;  valoresVolumessss++){

                        valor[valordalisnhas][valordascolunass][valoresVolumessss] = num++;


                    }

                }
            }


            return valor;


        }
    }
    }

