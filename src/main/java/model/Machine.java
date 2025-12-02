package model;

import java.util.Arrays;

public class Machine {
    String machineName;
    String gameGender;
    int gamePrice;
    boolean status;
    int gamesCounter;
    int[] ranking;

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getGameGender() {
        return gameGender;
    }

    public void setGameGender(String gameGender) {
        this.gameGender = gameGender;
    }

    public int getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getGamesCounter() {
        return gamesCounter;
    }

    public void setGamesCounter(int gamesCounter) {
        this.gamesCounter = gamesCounter;
    }

    public int[] getRanking() {
        return ranking;
    }

    public void setRanking(int[] ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "machineName='" + machineName + '\'' +
                ", gameGender='" + gameGender + '\'' +
                ", gamePrice=" + gamePrice +
                ", status=" + status +
                ", gamesCounter=" + gamesCounter +
                ", ranking=" + Arrays.toString(ranking) +
                '}';
    }
}
