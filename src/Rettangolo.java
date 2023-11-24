public class Rettangolo extends Forma{
    private FormaUnica tipo;
    double base;
    double altezza;

    public Rettangolo(double base,double altezza ) {
        this.tipo = FormaUnica.RETTANGOLO;
        this.base=base;
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
     return calcolaArea=base* altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "calcolaArea=" + calcolaArea +
                '}';
    }
}
