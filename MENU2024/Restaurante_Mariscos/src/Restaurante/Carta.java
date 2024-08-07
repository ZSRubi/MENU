package Restaurante;

public class Carta {
   
   static private String comida="";
   static private String bebida="";
   static private int precioComida;
   static private int precioBebida;

    public Carta(String comida, String bebida, int precioComida, int precioBebida) {
        this.comida = comida;
        this.bebida = bebida;
        this.precioComida = precioComida;
        this.precioBebida = precioBebida;
    }
    

    public Carta() {
        
    }

    public static String getComida() {
        return comida;
    }

    public static void setComida(String comida) {
        Carta.comida = comida;
    }

    public static String getBebida() {
        return bebida;
    }

    public static void setBebida(String bebida) {
        Carta.bebida = bebida;
    }

    public static int getPrecioComida() {
        return precioComida;
    }

    public static void setPrecioComida(int precioComida) {
        Carta.precioComida = precioComida;
    }

    public static int getPrecioBebida() {
        return precioBebida;
    }

    public static void setPrecioBebida(int precioBebida) {
        Carta.precioBebida = precioBebida;
    }

}

