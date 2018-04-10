public abstract class DatoMatCom{
    protected double dato1;
    protected double dato2;
    protected Sumar sumita;
    protected Multiplicar multi;
    
    public DatoMatCom(double dato1, double dato2){
        this.dato1=dato1;
        this.dato2=dato2;
    }
    public DatoMatCom Sumando(DatoMatCom obj){
        return sumita.Suma(this, obj);
    }
    public DatoMatCom Multiplicando(DatoMatCom obj){
        return multi.Multiplicar(this, obj);
    }
    public void setDato1(double dato1){
        this.dato1=dato1;
    }
    public double getDato1(){
        return dato1;
    }
    public void setDato2(double dato2){
        this.dato2=dato2;
    }
    public double getDato2(){
        return dato2;
    }
    public abstract void mostrarDatos();
}
