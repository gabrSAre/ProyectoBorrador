package com.githubprueba.gabrsare;

public class Bebidas {
    private String tipoDeBebida;
    private int cantidadDeEnvases;
    private float precioPorUnidad;

    public String getTipoDeBebida() {
        return tipoDeBebida;
    }

    public void setTipoDeBebida(String tipoDeBebida) {
        this.tipoDeBebida = tipoDeBebida;
    }

    public int getCantidadDeEnvases() {
        return cantidadDeEnvases;
    }

    public void setCantidadDeEnvases(int cantidadDeEnvases) {
        this.cantidadDeEnvases = cantidadDeEnvases;
    }

    public float getPrecioPorUnidad() {
        return precioPorUnidad;
    }

    public void setPrecioPorUnidad(float precioPorUnidad) {
        this.precioPorUnidad = precioPorUnidad;
    }


    public float importe(){
        return this.precioPorUnidad*this.cantidadDeEnvases;
    }


    @Override
    public String toString() {
        return "Bebidas: " +
                "tipoDeBebida=" + tipoDeBebida +
                "\ncantidadDeEnvases=" + cantidadDeEnvases +
                "\nprecioPorUnidad=" + precioPorUnidad +
                "\n Importe por pedido " + importe();
    }
}
