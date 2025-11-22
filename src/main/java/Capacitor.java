public class Capacitor extends Componente{
    private int reactanciaCapacitiva;

    public Capacitor(float voltaje, float corriente, float potencia, TipoMedida medida, int reactanciaCapacitiva) {
        super(voltaje, corriente, potencia, TipoMedida.volt);
        this.reactanciaCapacitiva = reactanciaCapacitiva;
    }

    public int getReactanciaCapacitiva() {
        return reactanciaCapacitiva;
    }

    public void setReactanciaCapacitiva(int reactanciaCapacitiva) {
        this.reactanciaCapacitiva = reactanciaCapacitiva;
    }

    @Override
    public String toString() {
        return "Capacitor{" + super.toString()+", "+
                "reactanciaCapacitiva=" + reactanciaCapacitiva +
                '}';
    }
}
