
/**
 * Write a description of class Simulacion here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
import java.util.Scanner;
public class Simulacion
{
    
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        Vista cvista = new Vista();
        Corriente ccorriente = new Corriente();
        Ahorro cahorro = new Ahorro();
        TargetaCredito card = new TargetaCredito();

        int depo = 50000;
        int giro = 45000;
        int op = 5;
        while(op>0)
        {
         System.out.print('\u000C');
         System.out.println("[1] Cuenta Vista.");
         System.out.println("[2] Cuenta Corriente.");
         System.out.println("[3] Cuenta de Ahorro.");
         System.out.println("[4] Targeta de Credito.");
         System.out.println("[0] Salir.");    
         op = teclado.nextInt();
         switch(op)
         {
          case 1:
          break;
          case 2:
          break;
          case 3:
          break;
          case 4:
          break;
          case 0:
          op = 0;
          break;
          default:
          break;
         }
        }
        System.out.print('\u000C');
        System.out.println("Ádios");      
        
    }
}
