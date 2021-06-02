package carlosv_v1.pkg2;

/*
 *  Carlos Alberto Vázquez Aguirre 
 */
import java.util.Scanner;
/**
 *
 * @author Ahedeijak
 */
public class FL_M2_06_11_2018_PotenciaCicloFor {
    
    public static void main (String[] args){
        
int exponente, i ;
double base, pot;
Scanner read = new Scanner(System.in);        

System.out.println("Ingresa la base de tu operación.");
base = read.nextDouble();

System.out.println("Ingresa el exponente de tu operación.");
exponente = read.nextInt();

pot = 1;

for(i=1; i<=exponente; i++){
    pot = pot*base; 
}

System.out.println("El valor de tu operación es: ");
System.out.println(base+"^"+exponente+"="+pot);


    }
    
}
