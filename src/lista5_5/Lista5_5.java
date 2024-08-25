package lista5_5;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_5 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITECIMA = 50;
        final int LIMITEBAIXO = 20;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            do{
                vet[x] = (int) (Math.random() * (LIMITECIMA+1));
            }while(vet[x] < LIMITEBAIXO);
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet));
    }    
}
