package model;

import java.util.Arrays;

public class Machine {
    private String machineName;
    private String gameGender;
    private int gamePrice;
    private boolean status;
    private int gamesCounter;
    private int[] ranking;

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


    public void modifyActivationMachine(boolean state) throws Exception {
        if (state) {
            if (isStatus()) {
                this.status = false;
            } else {
                throw new Exception("La máquina no puede desactivarse ya está desactivada.");
            }
        } else {
            if (!isStatus()) {
                this.status = true;
            } else {
                throw new Exception("La máquina no puede activarse ya está activada.");
            }
        }
    }
}