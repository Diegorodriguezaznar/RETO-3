public class Television extends Electrodomestico{
    public static final int CONSTANTE_PULGADAS = 20;
    public static final boolean CONSTANTE_TDT = false;
    //------------------PESO---------------------------
    protected int _pulgadas;

    public void setPulgadas(int _pulgadas) {
        this._pulgadas = _pulgadas;
    }
    public int getPulgadas(){
        return _pulgadas;
    }

    //------------------PESO---------------------------
    protected boolean _TDT;

    public void setTDT(boolean _TDT) {
        this._TDT = _TDT;
    }
    public boolean getTDT(){
        return _TDT;
    }


    //--------------CONSTRUCTOR POR DEFECTO----------------
    public  Television(){
        super(CONSTANTE_PRECIOBASE, CONSTANTE_COLOR, CONSTANTE_CONSUMOENERGETICO, CONSTANTE_PESO);
        this._pulgadas = CONSTANTE_PULGADAS;
        this._TDT = CONSTANTE_TDT;

    }

    //------------CONSTRUCTOR PRECIO Y PESO-----------------
    public  Television(int preciobase, int peso){
        super(preciobase, CONSTANTE_COLOR,CONSTANTE_CONSUMOENERGETICO, peso);
        this._pulgadas = CONSTANTE_PULGADAS;
        this._TDT = CONSTANTE_TDT;

    }

    //----------------CONSTRUCTOR COMPLETO----------------
    public Television(int pulgadas, int preciobase, Color color, Letra consumoenergetico, int peso){
        super(preciobase, color, consumoenergetico, peso);
        this._pulgadas = 30;
        this._TDT = true;

    }
}