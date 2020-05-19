package Mapa;

public class Main {
	public static void main(String[]Args) {
		Físico.Río Río = new Físico.Río ("Guadalquivir", 543.9, 4);
		System.out.println(Río.PasardatosToString());
		
		Físico.Montaña Montaña = new Físico.Montaña("Teide", 3421, "España");
		System.out.println(Montaña.PasardatosToString());
		
		Político.País País = new Político.País("España", "Madrid", "Euro", 544232, 321);
		System.out.println(País.PasardatosToString());
	}

}
