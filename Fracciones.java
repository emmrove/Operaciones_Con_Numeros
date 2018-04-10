public class Fracciones extends DatoMatCom{
    public Fracciones(double dato1, double dato2){
        super(dato1, dato2);
        sumita = new SumaFraccion();
        multi = new MultiplicaDirecta();
    }
    @Override
    public void mostrarDatos(){
        System.out.println((int)dato1 + "/" + (int)dato2);
    }
}