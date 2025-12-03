import model.Player;
import utils.Utils;
import model.Player;
public class Main {
    static Player player=new Player();
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
                       System.out.println("Esperamos verte pronto de nuevo!");
                       getOut=true;
                       break;
                   case 1:
                      player.playerSignIn();
                       break;
                   case 2:
                       //playerLogIn();
                       if (playerLogin()==true){
                           System.out.println("Hola de nuevo"+player.getName());
                       }
                       break;
                   case 3:
                      // selectMachine();
                       break;
                   case 4:
                     //  checkMachineStatus();
                       break;
                   case 5:
                     //  addCredits();
                       break;
               }

           }while(!getOut);

    }




}
