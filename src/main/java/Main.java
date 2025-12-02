import utils.Utils;
public class Main {
    public static void main(String[] args) {
        getMainMenu();


    }

    /**
     * Metodo que muestra las opciones del menu principal
     */
    public static void getMainMenu() throws Exception{
            boolean getOut=false;
        System.out.println("~~~~~~ Bienvenido a Recreativas Luque ~~~~~~");
            System.out.println("Pasa y diviertete: \n 0. Salir del programa \n 1. registrarme como usuario \n 2. iniciar sesion " +
                    "\n 3. Elegir maquina \n 4. Consultar actividad de una maquina");
            int option = Utils.getNumber(0,4,"Introduce opción: ", "Subnormal eso no es correcto :(");
           do {
               switch (option){
                   case 0:
                       getOut=true;
                       break;
                   case 1:
                       userSignIn();
                       break;
                   case 2:
                       userLogIn();
                       break;
                   case 3:
                       selectMachine();
                       break;
                   case 4:
                       checkMachineStatus();
               }

           }while(!getOut);

    }




}
