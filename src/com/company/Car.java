package com.company;

public class Car {

    private String cor;
    private String marca;
    private String modelo;
    private int ano;
    private float potencia;
    private float velocidade;
    private float tanqueAtual;
    private float tanqueMax;

    public String getCor() { return cor; }

    public void setCor(String cor) { this.cor = cor; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }

    public void setAno(int ano) { this.ano = ano; }

    public float getPotencia() { return potencia; }

    public void setPotencia(float potencia) { this.potencia = potencia; }

    public float getVelocidade() { return velocidade; }

    public void setVelocidade(float velocidade) { this.velocidade = velocidade; }

    public float getTanqueAtual() { return tanqueAtual; }

    public void setTanqueAtual(float tanqueAtual) { this.tanqueAtual = tanqueAtual; }

    public float getTanqueMax() { return tanqueMax; }

    public void setTanqueMax(float tanqueMax) { this.tanqueMax = tanqueMax; }

    public Car(String cor, String marca, String modelo, int ano, float potencia, float velocidade, float tanqueAtual, float tanqueMax) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.tanqueAtual = tanqueAtual;
        this.tanqueMax = tanqueMax;
    }

    public Car(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        float value = this.velocidade * 0.005f;

        if (this.tanqueAtual - value >= 0) {
            this.velocidade += (potencia * 0.01f);
            tanqueAtual -= value;
        }
    }

    public float abastecer(float value) {
        float add = this.tanqueAtual + value;


        if (add <= this.tanqueMax) {
            this.tanqueAtual = add;
        } else {
            this.tanqueAtual = this.tanqueMax;
        }

        return this.tanqueAtual;
    }

    public float frear() {
        float value = this.velocidade - (this.velocidade * 0.1f);

        if(value >= 0) {
            this.velocidade = value;
        }

        return value;
    }

    public float frear(int port) {
        float value = this.velocidade - port;

        if(value >= 0) {
            this.velocidade = value;
        }

        return value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", potencia=" + potencia +
                ", velocidade=" + velocidade +
                ", tanqueAtual=" + tanqueAtual +
                ", tanqueMax=" + tanqueMax +
                '}';
    }
}