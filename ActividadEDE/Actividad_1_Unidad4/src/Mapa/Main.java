package Mapa;

public class Main {
	public static void main(String[]Args) {
		F�sico.R�o R�o = new F�sico.R�o ("Guadalquivir", 543.9, 4);
		System.out.println(R�o.PasardatosToString());
		
		F�sico.Monta�a Monta�a = new F�sico.Monta�a("Teide", 3421, "Espa�a");
		System.out.println(Monta�a.PasardatosToString());
		
		Pol�tico.Pa�s Pa�s = new Pol�tico.Pa�s("Espa�a", "Madrid", "Euro", 544232, 321);
		System.out.println(Pa�s.PasardatosToString());
	}

}
