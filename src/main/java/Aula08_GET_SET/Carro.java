package Aula08_GET_SET;

public class Carro {
    /**
     * ATRIBUTOS
     */
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consumoCombustivel;

    /**
     * Construtor com todos os atributos
     * @param marca
     * @param modelo
     * @param numPassageiros
     * @param capCombustivel
     * @param consumoCombustivel
     */
    public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    /**
     * Construtor com atributo marca
     * @param marca
     */
    public Carro(String marca){
        this.marca = marca;
    }

    /**
     * Construtor vazio
     */
    public Carro() {
    }

    /**
     *
     * @return
     */
    public String getMarca(){
        return this.marca;
    }

    /**
     *
     * @param marca
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     *
     * @return
     */
    public String getModelo(){
        return this.modelo;
    }

    /**
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     *
     * @return
     */
    public int getNumPassageiros(){
        return this.numPassageiros;
    }

    /**
     *
     * @param numPassageiros
     */
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }

    /**
     *
     * @return
     */
    public double getCapCombustivel() {
        return capCombustivel;
    }

    /**
     *
     * @param capCombustivel
     */
    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    /**
     *
     * @return
     */
    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    /**
     *
     * @param consumoCombustivel
     */
    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numPassageiros=" + numPassageiros +
                ", capCombustivel=" + capCombustivel +
                ", consumoCombustivel=" + consumoCombustivel +
                '}';
    }
}
