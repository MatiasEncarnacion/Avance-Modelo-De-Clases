public class Fuente extends Componente{

    public Fuente(){
        this.setMedida(TipoMedida.volt);
    }
    public Fuente(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        super(voltaje, corriente, resistencia, potencia, TipoMedida.volt);
    }

    @Override
    public String toString() {
        return "Fuente{Voltaje ="+getVoltaje()+"}";
    }
}
