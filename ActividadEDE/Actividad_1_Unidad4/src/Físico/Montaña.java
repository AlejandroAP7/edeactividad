package F�sico;

public class Monta�a {

String nombre;
double altura;
String pais;

//Constructores
public Monta�a(String nombre,double altura,String pais){
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
String stringcontodoslosdatos = "Los datos de la monta�a son: " + "    Nombre: " + nombre + 
	 "   Altura: " + altura + "Km " + "   Pa�s: " + pais;
return stringcontodoslosdatos;
}


}
