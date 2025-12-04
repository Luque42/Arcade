package model;

import java.util.Objects;
import java.util.Scanner;

public class Player {
    String name;
    String dni;
    int Credits;
    int playedGames;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        Credits = credits;
    }

    public int getPlayedGames() {
        return playedGames;
    }

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int playedGames, String dni, int credits) {
        this.name = name;
        this.playedGames = playedGames;
        this.dni = dni;
        Credits = credits;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dni='" + dni + '\'' +
                ", Credits=" + Credits +
                ", playedGames=" + playedGames +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name);
    }


    /**
     * metodo que da de alta un usuario nuevo
     * añade 20 creditos por defecto a cada usuario cuando se crea
     */
    public void playerSignIn() {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String dni = "";
        System.out.println("Escribe el nombre de usuario");
        name = sc.nextLine();
        setName(name);
        System.out.println("Escribe el dni");
        dni = sc.nextLine();
        setDni(dni);
        setCredits(20);

    }

    /**
     * metodo que permite al usuario acceder a su menu de usuario mediante un nombre registrado previamente
     *
     * @param player
     * @return true si el usuario existe
     */
    public boolean playerLogin(Object player) {
        boolean successLog = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Quien eres?");
            String newplayer = sc.nextLine();
            if (player.equals(newplayer)) {
                successLog = true;
                System.out.println("Hola de nuevo" + newplayer);

            } else {
                System.out.println("No te conozco");
                System.out.print("vete a comer galletas dinosaurus");
            }


        } while (!successLog);
        return successLog;

    }
}

