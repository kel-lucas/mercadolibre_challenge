import java.util.ArrayList;
import java.util.List;

public class Filter {

    int cont;
    int end;
    List <Integer> guard = new ArrayList <Integer>();
    void filtroDigitoMaximo(int maxDigit){
        for (int start = 1000; start<= 9999; start++){
           end = start;
            while (end!= 0){
            if( end % 10 <= maxDigit){
                break;
            }else{
                end = end / 10;
                cont = cont + 1;
                end = end / 10;
            }
            if (cont == 4){
                guard.add(start);
            }
           }
        }
    }
    
}
