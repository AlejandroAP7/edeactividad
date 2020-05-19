package Físico;

public class Montaña {

String nombre;
double altura;
String pais;

//Constructores
public Montaña(String nombre,double altura,String pais){
this.nombre= nombre;
this.altura= altura;
this.pais= pais;


}

//Getters

String Getnombre() {
	return this.nombre;
}

double Getaltura() {
	return this.altura;
}

String Getpais() {
	return this.pais;
}

//Setters

void Setnombre (String nuevonombre) {
	this.nombre= nuevonombre;
}

void Setaltura(Double nuevaaltura) {
	this.altura= nuevaaltura;
}
void Setpais(String nuevopais) {
	this.pais= nuevopais;
}

// Pasar datos a String

public String PasardatosToString () {
String stringcontodoslosdatos = "Los datos de la montaña son: " + "    Nombre: " + nombre + 
	 "   Altura: " + altura + "Km " + "   País: " + pais;
return stringcontodoslosdatos;
}


}
