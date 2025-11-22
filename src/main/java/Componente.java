import java.util.Objects;

public class Componente {
    private float voltaje;
    private float corriente;
    private int resistencia;
    private float potencia;
    private TipoMedida medida;

    public Componente() {
    }

    public Componente(float voltaje, float corriente, int resistencia, float potencia, TipoMedida medida) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.resistencia = resistencia;
        this.potencia = potencia;
        this.medida = medida;
    }

    public Componente(float voltaje, float corriente, float potencia, TipoMedida medida) {
        this.voltaje = voltaje;
        this.corriente = corriente;
        this.potencia = potencia;
        this.medida = medida;
    }

    public float getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(float voltaje) {
        this.voltaje = voltaje;
    }

    public float getCorriente() {
        return corriente;
    }

    public void setCorriente(float corriente) {
        this.corriente = corriente;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public TipoMedida getMedida() {
        return medida;
    }

    public void setMedida(TipoMedida medida) {
        this.medida = medida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Float.compare(voltaje, that.voltaje) == 0 && Float.compare(corriente, that.corriente) == 0 && resistencia == that.resistencia && Float.compare(potencia, that.potencia) == 0 && medida == that.medida;
    }

    @Override
    public int hashCode() {
        return Objects.hash(voltaje, corriente, resistencia, potencia, medida);
    }

    @Override
    public String toString() {
        return "Componente{" +
                "voltaje=" + voltaje +
                ", corriente=" + corriente +
                ", resistencia=" + resistencia +
                ", potencia=" + potencia +
                ", medida=" + medida +
                '}';
    }
}
