package com.distribuida.entities;
//atributos
public class Producto {
private int idProducto;
private String nombre;
private String decripcion;
private double precio;
private int stock;


//Constructor
public Producto() {}
//metodos getters and setters


public int getIdProducto() {
	return idProducto;
}


public void setIdProducto(int idProducto) {
	this.idProducto = idProducto;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDecripcion() {
	return decripcion;
}


public void setDecripcion(String decripcion) {
	this.decripcion = decripcion;
}


public double getPrecio() {
	return precio;
}


public void setPrecio(double precio) {
	this.precio = precio;
}


public int getStock() {
	return stock;
}


public void setStock(int stock) {
	this.stock = stock;
}


@Override
public String toString() {
	return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", decripcion=" + decripcion + ", precio="
			+ precio + ", stock=" + stock + "]";
}




}
