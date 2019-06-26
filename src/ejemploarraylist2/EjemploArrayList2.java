package ejemploarraylist2;
/**
 *
 * @author stiven
 */
import java.util.*;
public class EjemploArrayList2 {
    /*GLOBALES*/
    public static ArrayList<String> nombre = new ArrayList();
    public static ArrayList<Double> salario = new ArrayList();
    public static ArrayList<Integer> Dias = new ArrayList();
    public static ArrayList<Double> Total = new ArrayList();
    public static Scanner leer = new Scanner(System.in);
    /*-------*/
    /*MAIN*/
    public static void main(String[] args) 
    {
        int x = 0, y = 1;
        do
        {
            System.out.println("Ingrese nombre del trabajador");
            nombre.add(leer.next());
            System.out.println("Ingrese Salario del trabajador");
            salario.add(leer.nextDouble());
            System.out.println("Ingrese la cantidad de dias trabajados");
            Dias.add(leer.nextInt());
            System.out.println("para finalizar ingrese 0 ");
            y = leer.nextInt();
            if(y == 0)
            {
                break;
            }
        }
        while(x == 0);
    }
}
