import model.Player;
import utils.Utils;
import model.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        getMainMenu();

    }

    /**
     * Metodo que muestra las opciones del menu principal
     */
    public static void getMainMenu() throws Exception{
            boolean getOut=false;
        Player player=new Player();
        Scanner sc=new Scanner(System.in);
        System.out.println("~~~~~~ Bienvenido a Recreativas Luque ~~~~~~");
            System.out.println("Pasa y diviertete: \n 0. Salir del programa \n 1. registrarme como usuario \n 2. iniciar sesion " +
                    "\n 3. Elegir maquina \n 4. Consultar actividad de una maquina");
            int option = Utils.getNumber(0,4,"Introduce opción: ", "Subnormal eso no es correcto :(");
            int playerMenu;
            int machineMenu;
            do {
                /**
                 * switch del menu principal del programa
                 */
               switch (option){
                   case 0:
                       System.out.println("Esperamos verte pronto de nuevo!");

                       getOut=true;

                       break;
                   case 1:
                      player.playerSignIn();
                       break;
                   case 2:
                       if (player.playerLogin(player)){
                           /**
                            * switch del menú de la vista del usuario
                            */
                           switch (playerMenu){
                               case 0:
                                   getMainMenu();

                               case 1:
                                   // selectMachine();
                                   /**
                                    * switch del menu de seleccion de maquina
                                    */
                                   switch(machineMenu){
                                       case 0:
                                           //  getUserMenu();
                                           break;
                                       case 1:
                                           // showActiveMachines()
                                           break;
                                       case 2:
                                           // showBestsMachines()
                                           break;
                                       case 3:
                                           // eraseMachine()
                                           break;
                                       case 4:
                                           //machine1Menu
                                           break;
                                       case 5:
                                           //machine2Menu
                                           break;
                                       case 6:
                                           //machine3Menu
                                           break;
                                       case 7:
                                           //machine4Menu
                                           break;
                                       case 8:
                                           //machine5Menu
                                           break;
                                   }
                                   break;

                               case 2:
                                   //  viewCredits();
                                   break;
                               case 3:
                                   // addCredits()
                                   break;
                               case 4:
                                    // gamblerCredits()
                                   break;
                               case 5:
                                   //erasePlayer()
                           }

                       }


               }

           }while(!getOut);

    }




}
