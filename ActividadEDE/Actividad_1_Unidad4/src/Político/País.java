package Político;

public class País {
	String nombre, capital,moneda;
	double extension;
	int habitantes;
	
//Constructores
	
public País(String nombre, String capital, String moneda, double extension, int habitantes) {
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
String stringcontodoslosdatos = "Los datos del país son: " + "    Nombre: " + nombre + 
	"    Capital: " + capital + "    Moneda:  " + moneda + "    Extensión: " + extension + "     Habitantes: "+ habitantes;
return stringcontodoslosdatos;
}

}
