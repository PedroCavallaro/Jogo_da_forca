/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forca_java;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
/**
 *
 * @author Usuário a Definir
 */
public class forca_funcoes {
     public static void imprimir(char vetor[]){
            System.out.println("+--------");
            System.out.println("|"+"\t"+"|");
            System.out.println("|"+"\t"+vetor[0]);
            System.out.println("|"+"\t"+vetor[1]);
            System.out.println("|"+"       "+vetor[2]+vetor[3]+vetor[4]);
            System.out.println("|"+"     "+vetor[5]+"  "+vetor[9]+"   "+vetor[7] );
            System.out.println("|"+"    "+vetor[6]+"   "+vetor[10]+"    "+vetor[8] );
            System.out.println("|"+"\t "+vetor[11]);
            System.out.println("|"+"      "+vetor[12]+"   "+vetor[14]);
            System.out.println("|"+"     "+vetor[13]+"     "+vetor[15]);
            System.out.println("|"); 
        
    }
     public static String[] lerTxt(String caminhoArquivo){
         String palavras[] = new String [1];
         try(
                 BufferedReader buffRead = new BufferedReader(new FileReader(caminhoArquivo));
                 ){
            String linha = "";
           
            
            while(true){
                if(linha != null){
                    //System.out.println(linha);
                }else{
                    break;
                }
                linha = buffRead.readLine();
                palavras = linha.split(";");
 
            }
         }catch(Exception e){
             
         }
         return palavras;
     }
   
     
    public static String[] Gerarpalavra(){
       String[] gerarPalavras = lerTxt("palavras.txt");
       String palavra;
       Random gerador = new Random();
       palavra = gerarPalavras[gerador.nextInt(gerarPalavras.length)];
       String[]converter = palavra.split("(?!^)");
       
        
       return converter;
     }
    
    public static void erros(int cont, char vetor[]){
         if(cont ==1){
             vetor[0] = 'O';

         }if(cont == 2){
             vetor[1] = '|';

             
         }if(cont == 3){
            vetor[2] = '-';
            vetor[3] = '-';
            vetor[4] = '-';

         }if(cont ==4){
            vetor[5] = '/';
            vetor[6] = '/';
         }if(cont == 5){
            vetor[9] = '|';
            vetor[10] = '|';
            vetor[11] = '|';

         }if(cont == 6){
            vetor[7] = '\\';
            vetor[8] = '\\';
            
         }if(cont == 7){
            vetor[12] = '/';
            vetor[13] = '/';
            
         }if(cont == 8){
            vetor[14] = '\\';
            vetor[15] = '\\';

         }
    } 
         
    public static boolean posicao( String vetResposta[],
             String vetConversor[], String letra){
         for (int i = 0; i < vetConversor.length; i++) {
              
             if(letra.equals(vetConversor[i])){
                 vetResposta[i] = letra;
             }
         }
              for (int i = 0; i < vetConversor.length; i++) {
                 if(letra.equals(vetResposta[i])){
                     vetResposta[i] = letra;
                     return true;
                    }
                }
              
        
         return false;
     } 
}
