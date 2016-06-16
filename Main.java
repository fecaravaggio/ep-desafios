import java.util.Scanner;
import java.util.ArrayList;

//ArrayList<String> bandas = new ArrayList<String> ();
public class Main {

	public static void main(String[] args) {
		long  maneiras[] = new long [30005];
		int valores[] = {1, 5, 10, 25, 50};

		int i, j, valor;
		maneiras[0] = 1;
		for(i=0; i<5; i++) {
			valor = valores[i];
		    for(j=valor; j<maneiras.length; j++) {
		        maneiras[j] += maneiras[j-valor];
		    }
		}

		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()) {
			String linha = sc.nextLine();
		    linha = linha.replaceAll(" ", "");
		    int n = Integer.parseInt(linha);
		    if (maneiras[n] > 1) System.out.println ("There are "+maneiras[n]+" ways to produce "+n+" cents change.");
		    else System.out.println("There is only 1 way to produce "+n+" cents change.");
		}
		sc.close();
	}
}
