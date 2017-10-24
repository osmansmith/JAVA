
/**
 * Write a description of class Cuenta here.
 * 
 * @author (Osman Ahumada) 
 * @version (1.0)
 */
public class Cuenta
{
   private int codigo;
   private String titular;
   private int ncuenta;
   
   public Cuenta(){}
   
   public void setCodigo(int codigo)
   {
    this.codigo = codigo;
   }
   public void setTitular(String titular)
   {
    this.titular = titular;
   }
   public void setNcuenta(int ncuenta)
   {
    this.ncuenta = ncuenta;
   }
   
   public int getCodigo()
   {
    return(this.codigo); 
   }
   public String getTitular()
   {
    return(this.titular);
   }
   public int getNcuenta()
   {
    return(this.ncuenta);
   }
}
