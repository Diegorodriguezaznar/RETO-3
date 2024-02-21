public class Lavadora extends Electrodomestico {
    public static final int CONSTANTE_CARGA = 5;
    //---------------------CARGA---------------------
    protected int _carga;

    public void setCarga(int _carga) {
        this._carga = _carga;
    }

    public int getCarga() {
        return _carga;
    }


    //--------------CONSTRUCTOR POR DEFECTO----------------
    public Lavadora() {
        super(CONSTANTE_PRECIOBASE, CONSTANTE_COLOR, CONSTANTE_CONSUMOENERGETICO, CONSTANTE_PESO);
        this._carga = CONSTANTE_CARGA;

    }

    //------------CONSTRUCTOR PRECIO Y PESO-----------------
    public Lavadora(int preciobase, int peso) {
        super(preciobase, CONSTANTE_COLOR, CONSTANTE_CONSUMOENERGETICO, peso);
        this._carga = CONSTANTE_CARGA;

    }

    //----------------CONSTRUCTOR COMPLETO----------------
    public Lavadora(int carga, int preciobase, Color color, Letra consumoenergetico, int peso) {
        super(preciobase, color, consumoenergetico, peso);
        this._carga = carga;

    }
}