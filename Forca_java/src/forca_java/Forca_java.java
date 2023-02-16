/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forca_java;

/**
 *
 * @author Usuário a Definir
 */
import java.util.Scanner;
import static forca_java.forca_funcoes.*;
public class Forca_java {

    /**
     * @param args the command line arguments
     */
    static final char vet[] = new char[16];
    static  String palavraEscolhida;
    public static void main(String[] args) {
        boolean vitoria = false;
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        String palavra[] = Gerarpalavra();
        String arrayResposta[] = new String [palavra.length];
        String letra = "";
        String palavraEscolhidaAux = String.join("", palavra);
        String checagem = "";
         
        
        
        for (int i = 0; i < arrayResposta.length; i++) {
                   arrayResposta[i] = "-";
        }
        
        while(!vitoria){
        

            imprimir(vet);
            for (int i = 0; i < arrayResposta.length; i++) {
                System.out.print("   ");
                System.out.print(arrayResposta[i]);
            }
            System.out.println("\n");


            System.out.println("Teste sua sorte: \n");
            letra = scan.next();
            posicao(arrayResposta,palavra, letra);
           
             
            if(!posicao(arrayResposta,palavra, letra)){
                cont +=1;
                erros(cont, vet);
            } 

            checagem = String.join("", arrayResposta);

            if(palavraEscolhidaAux.equals(checagem)){
                imprimir(vet);
                System.out.println("PARABÉNS!!! VOCÊ ACERTOU A PALAVRA");
                vitoria = true;

            }
            if(!vitoria && cont == 8){
                imprimir(vet);
                System.out.println("Fim de jogo");
                System.out.println("A palavra era:"+ palavraEscolhidaAux);
                break;
            }
        }
        
    }
    
}
