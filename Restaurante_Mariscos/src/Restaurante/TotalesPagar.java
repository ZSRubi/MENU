
package Restaurante;


final public class TotalesPagar{
  
     static private int precioTotal;
     
    
   public TotalesPagar (int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public TotalesPagar() {
    
    }

    public static int getPrecioTotal() {
        return precioTotal;
    }

    public static void setPrecioTotal(int precioTotal) {
        TotalesPagar.precioTotal = precioTotal;
    }

}
