public class SumaDirecta implements Sumar{
    @Override
    public DatoMatCom Suma(DatoMatCom obj, DatoMatCom obj2){
        obj2.setDato1(obj.getDato1() + obj2.getDato1());
        obj2.setDato2(obj.getDato2() + obj2.getDato2());
        return obj2;
    }
}