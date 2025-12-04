package utils;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
    /**
     * metodo que comprueba si el valor es un numero entero
     * @param msn mensaje que se le muestra al usuario para que introduzca el numero
     * @param msnError mensaje de error que se le devuelve si es un dato distinto de un numero entero
     * @return
     */
    public static int readInt(String msn, String msnError) {
        int result = 0;
        boolean isValid = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print(msn);
                result = sc.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println(msnError);
                isValid = false;
                sc.nextLine();

            }
        } while (!isValid);
        return result;
    }

    /**
     *metodo que pide un numero al usuario dentro de un rango y que lanza un error si este no es un entero
     * @param min numero minimo que espera el metodo del usuario
     * @param max numero maximo que espera el metodo del usuario
     * @param msn mensaje que le aparece al usuario cuando tenga que introducir el entero
     * @param msnError
     * @return
     */
    public static int getNumber(int min, int max, String msn, String msnError){
        int result=0;
        boolean validNumber=false;
        do{
            result=readInt(msn, msnError);
            if(result>=min && result<=max){
                validNumber=true;
            }else{
                System.out.println(msnError);
                validNumber=false;
            }
        }while(!validNumber);
        return result;
    }
    public static String getString(String msg, String errorMsg){
        Scanner sc=new Scanner(System.in);
        System.out.println(msg);
        String word = sc.nextLine();
        return word;
    }

}
