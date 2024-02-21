public class Electrodomestico {
    //--------------ATRIBUTOS POR DEFECTO---------------
    public static final Color CONSTANTE_COLOR = Color.Blanco;
    public static final int CONSTANTE_PESO = 5;
    public static final int CONSTANTE_PRECIOBASE = 100;
    public static final Letra CONSTANTE_CONSUMOENERGETICO = Letra.F;


    //-------------------PRECIO BASE--------------------
    protected int _preciobase;

    public void setPrecioBase(int _preciobase) {
        this._preciobase = _preciobase;
    }

    public int getPrecioBase() {
        return _preciobase;
    }

    //--------------------COLOR---------------------
    protected Color _color;

    public void setColor(Color _color) {
        this._color = _color;
    }

    public Color getColor() {
        return _color;
    }

    //-------------CONSUMO ENERGÉTICO-----------------
    protected Letra _consumoenergetico;

    public void setConsumoEnergetico(Letra _consumoenergetico) {
        this._consumoenergetico = _consumoenergetico;
    }

    public Letra getConsumoEnergetico() {
        return _consumoenergetico;
    }

    public int comprobarConsumoEnergetico(String _consumoenergetico) {
        Letra iConsumo = Letra.F;
        if (_consumoenergetico.compareToIgnoreCase(Letra.A.name()) == 0) {
            iConsumo = Letra.A;
        } else if (_consumoenergetico.compareToIgnoreCase(Letra.B.name()) == 0) {
            iConsumo = Letra.B;
        } else if (_consumoenergetico.compareToIgnoreCase(Letra.C.name()) == 0) {
            iConsumo = Letra.C;
        } else if (_consumoenergetico.compareToIgnoreCase(Letra.D.name()) == 0) {
            iConsumo = Letra.D;
        } else if (_consumoenergetico.compareToIgnoreCase(Letra.E.name()) == 0) {
            iConsumo = Letra.E;
        }
        return iConsumo.getValue();
    }

    //------------------PESO---------------------------
    protected int _peso;

    public void setPeso(int _peso) {
        this._peso = _peso;
    }

    public int getPeso() {
        return _peso;
    }

    //---------------------COLORES------------------------
    public enum Color {
        Blanco(0), Negro(1), Rojo(2), Azul(3), Gris(4);
        private final int value;

        Color(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public int comprobarColor(String _color) {
        Color iColor = Color.Blanco;
        if (_color.compareToIgnoreCase(Color.Gris.name()) == 0) {
            iColor = Color.Gris;
        } else if (_color.compareToIgnoreCase(Color.Negro.name()) == 0) {
            iColor = Color.Negro;
        } else if (_color.compareToIgnoreCase(Color.Rojo.name()) == 0) {
            iColor = Color.Rojo;
        } else if (_color.compareToIgnoreCase(Color.Azul.name()) == 0) {
            iColor = Color.Azul;
        }
        return iColor.getValue();
    }

    //----------------------LETRAS-------------------------
    public enum Letra {
        A(0), B(1), C(2), D(3), E(4), F(5);
        private final int value;

        Letra(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    //----------------CONSTRUCTOR COMPLETO-----------------
    public Electrodomestico(int preciobase, Color color, Letra consumoenergetico, int peso) {
        this._preciobase = preciobase;
        this._color = color;
        this._consumoenergetico = consumoenergetico;
        this._peso = peso;
    }

    //---CONSTRUCTOR PRECIO y PESO (el resto por defecto)-----
    public Electrodomestico(int preciobase, int peso) {
        this._preciobase = preciobase;
        this._color = CONSTANTE_COLOR;
        this._consumoenergetico = CONSTANTE_CONSUMOENERGETICO;
        this._peso = peso;
    }

    //------------------CONSTRUCTOR POR DEFECTO------------------
    public Electrodomestico() {
        this._preciobase = CONSTANTE_PRECIOBASE;
        this._color = CONSTANTE_COLOR;
        this._consumoenergetico = CONSTANTE_CONSUMOENERGETICO;
        this._peso = CONSTANTE_PESO;
    }

}