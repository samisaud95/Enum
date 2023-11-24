public class Triangolo extends Forma {
    private FormaUnica tipo;
    double base;
    double altezza;


    public Triangolo(double base,double altezza) {
        this.tipo = FormaUnica.TRIANGOLO;
        this.base= base;
        this.altezza=altezza;
    }

    public FormaUnica getTipo() {
        return tipo;
    }

    public void setTipo(FormaUnica tipo) {
        this.tipo = tipo;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }


    public double CalcolaArea() {
       return calcolaArea= base* altezza/2;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "tipo=" + tipo +
                '}';
    }
}