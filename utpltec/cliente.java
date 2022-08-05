package com.utpltec;

/**
 * Hello world!
 *
 */
public class cliente {

private String nombreCliente;
private int edadClient;
private int horasJugadas;
private String juegoFavorito;

//constructores
public cliente() {
}

public cliente(String nombreCliente, int edadClient, int horasJugadas, String juegoFavorito) {
    this.nombreCliente = nombreCliente;
    this.edadClient = edadClient;
    this.horasJugadas = horasJugadas;
    this.juegoFavorito = juegoFavorito;
}

//metodos ingresados

public String getNombreCliente() {
    return nombreCliente;
}

public void setNombreCliente(String nombreCliente) {
    this.nombreCliente = nombreCliente;
}

public int getEdadClient() {
    return edadClient;
}

public void setEdadClient(int edadClient) {
    this.edadClient = edadClient;
}

public double getHorasJugadas() {
    return horasJugadas;
}

public void setHorasJugadas(int horasJugadas) {
    this.horasJugadas = horasJugadas;
}

public String getJuegoFavorito() {
    return juegoFavorito;
}

public void setJuegoFavorito(String juegoFavorito) {
    this.juegoFavorito = juegoFavorito;
}

public void parametrosCliente(){
    System.out.println("Datos Cliente" + this.nombreCliente + " " + this.horasJugadas );

}











}

 














