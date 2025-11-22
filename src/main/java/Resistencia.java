public class Resistencia extends Componente {

    public Resistencia(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        super(voltaje, corriente, resistencia, potencia, TipoMedida.ohm);
    }

}
