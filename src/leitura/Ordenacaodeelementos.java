package leitura;
import java.util.Scanner;
public class Ordenacaodeelementos{
public static void main(String[] args ){
    int gardavalor = 0 ;
    int valorguardado =1 ;
    int tempo =0 , contador = 0;
    int [] valores  = {6,72,9, 5 ,4, 3, 2 };
    for (int i=0; i<=valores.length; i++){

        for(int j=0; j< valores.length-1 - i; j++){
            if (valores[j]> valores[j+1 ]){

                gardavalor = valores[j+1];
                valores[j+1 ] = valores[j];
                valores[j] = gardavalor;
            }
        }
        tempo++;
    }
    System.out.println("Exibindo valores:");
    System.out.println(tempo);
    System.out.println("------------------------");
    for (int num : valores ){
        System.out.println(num);
    }
}


}
