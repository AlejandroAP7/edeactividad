
package F�sico;

public class R�o {

String nombre;
Double longitud;
int numAfluentes;

//Constructores

public R�o(String nombre, double longitud, int numAfluentes) {
this.nombre= nombre;
this.longitud= longitud;
this.numAfluentes= numAfluentes;


}
//Getters

String Getnombre (){
	return this.nombre;
	
	}
double Getlongitud () {
	return this.longitud;
}
int numAfluentes () {
	return this.numAfluentes;
}

//Setters

void Setnombre (String nuevonombre) {
	this.nombre= nuevonombre;
}

void Setlongitud(Double nuevalongitud) {
	this.longitud= nuevalongitud;
}
void SetnumAfluentes(int nuevonumAfluentes) {
	this.numAfluentes= nuevonumAfluentes;
}

/// Pasar datos a String

public String PasardatosToString () {
String stringcontodoslosdatos = "Los datos del r�o son: " + "    Nombre: " + nombre + 
	"    Longitud: " + longitud + "    Km " + "    NumAfluentes: " + numAfluentes;
return stringcontodoslosdatos;
}







}
