public class Fuente extends Componente{

    public Fuente(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        super(voltaje, corriente, resistencia, potencia, TipoMedida.volt);
    }

}
