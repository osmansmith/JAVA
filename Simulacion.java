
/**
 * Write a description of class Simulacion here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */

public class Simulacion
{
    
    public static void main(String[] args)
    {
        Vista cvista = new Vista();
        Corriente ccorriente = new Corriente();
        Ahorro cahorro = new Ahorro();
        TargetaCredito card = new TargetaCredito();

        int depo = 50000;
        int giro = 45000;
        
        System.out.println("Cuenta Vista");        
        System.out.println("");        
        System.out.println("Deposito :  "+depo);
        cvista.depositar(depo);
        System.out.println("Giro  :  "+giro);        
        cvista.girar(giro);
        System.out.println("Saldo disponible :  "+cvista.consultar());        
        
    }
}
