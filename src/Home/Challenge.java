package Home;

import java.util.ArrayList;
import java.util.List;

import Filters.Filtro;

public class Challenge {

  /**Construa um programa que devolva todos os inteiros de 4 digitos cuja soma seja igual a 21. Nenhum dígito do número dever
   * deverá ser maior que o maxDigit.
   * Ex.: maxDigit = 6, logo. 1006, 1010, 1011, 1012, 1013.. 1016, 1020.
   */
  public static void main(String[] args) {
	  Filtro filtro = new Filtro();
	  List <Integer> guard = new ArrayList <Integer>();
	  int maxDigit = 6;
	  filtro.filtroDigitoMaximo(guard, maxDigit);
	  System.out.println(guard.size());
	  
		/*
		 * for (int x = 0; x <= guard.size(); x++) { int y = guard[x];
		 * System.out.println(y); }
		 */
  }
}
