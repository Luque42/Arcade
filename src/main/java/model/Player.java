package model;

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

    public void setPlayedGames(int playedGames) {
        this.playedGames = playedGames;
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
}

