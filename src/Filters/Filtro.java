package Filters;
import java.util.List;

public class Filtro {

    int cont;
    int end;
    public void filtroDigitoMaximo(List <Integer> guard, int maxDigit){
        for (int start = 1000; start<= 9999; start++){
           end = start;
            while (end!= 0){
            if( end % 10 <= maxDigit){
                break;
            }else{
                end = end / 10;
                cont = cont + 1;
            }
            if (cont == 4){
                guard.add(start);
            }
           }
        }
    }
    
}
