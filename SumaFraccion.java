public class SumaFraccion implements Sumar{
    @Override
    public DatoMatCom Suma(DatoMatCom obj, DatoMatCom obj2){
        if(obj.getDato2() == obj2.getDato2()){
            obj2.setDato1(obj.getDato1() + obj2.getDato1());
            obj2.setDato2(obj.getDato2());
        }else{
            obj2.setDato2(obj.getDato2()*obj2.getDato2());
            obj2.setDato1(
                    (obj.getDato1()*obj2.getDato2()) + (obj2.getDato1()*obj.getDato2())
                        );
        }
        obj2 = FraccionSimplificada(obj2);
        return obj2;
    }
    
    public DatoMatCom FraccionSimplificada(DatoMatCom obj){
        double numero=0;
        if((obj.getDato1() % obj.getDato2())==0){
            numero=obj.getDato1() / obj.getDato2();
            obj.setDato1(numero);
            obj.setDato2(0);
        }else {
            if((obj.getDato2() % obj.getDato1())==0){
                numero = obj.getDato2() / obj.getDato1();
                obj.setDato1(1);
                obj.setDato2(numero);
            }
        }
        return obj;
    }
}