package Pol�tico;

public class Pa�s {
	String nombre, capital,moneda;
	double extension;
	int habitantes;
	
//Constructores
	
public Pa�s(String nombre, String capital, String moneda, double extension, int habitantes) {
	this.nombre= nombre;
	this.capital= capital;
	this.moneda= moneda;
	this.extension= extension;
	this.habitantes= habitantes;
}

//Getters

String Getnombre() {
	return this.nombre;
}

String Getcapital() {
	return this.capital;
}

String Getmoneda() {
	return this.moneda;
}

double Getextension() {
	return this.extension;
}

int Gethabitantes() {
	return this.habitantes;
}
//Setters

void Setnombre (String nuevonombre) {
	this.nombre= nuevonombre;
}

void Setcapital(String nuevacapital) {
	this.capital= nuevacapital;
}
void Setmoneda(String nuevamoneda) {
	this.moneda= nuevamoneda;
}

void Setextension(double nuevaextension) {
	this.extension= nuevaextension;
}

void Sethabitantes(int nuevohabitantes) {
	this.habitantes= nuevohabitantes;
}

// Pasar datos a ToString

public String PasardatosToString () {
String stringcontodoslosdatos = "Los datos del pa�s son: " + "    Nombre: " + nombre + 
	"    Capital: " + capital + "    Moneda:  " + moneda + "    Extensi�n: " + extension + "     Habitantes: "+ habitantes;
return stringcontodoslosdatos;
}

}
