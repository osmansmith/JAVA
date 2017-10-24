
/**
 * Write a description of class Vista here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public class Vista extends Cuenta
{
    public Vista(){}
    
    public void depositar(int valor)
    {
     try
     {
         this.setSaldo(this.getSaldo() + valor);
     }
     catch(Exception ex)
     {
        System.out.print(ex);
     }
    
    }
    public void girar(int valor)
    {
     try
     {
         if(this.getSaldo() > 1000 && valor > 1000)
         {
            this.setSaldo(this.getSaldo() - valor);
         }
     }
     catch(Exception ex)
     {
        System.out.print(ex);
     }
     
    }
    public int consultar()
    {
      return(this.getSaldo());
    }
}
