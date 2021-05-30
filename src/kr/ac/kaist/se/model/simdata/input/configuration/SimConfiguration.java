package kr.ac.kaist.se.model.simdata.input.configuration;

/**
 * A class to specify a simulation configuration
 * @author ymbaek
 */
public class SimConfiguration {
    private int simTotalTime = 0;

    public SimConfiguration(int simTotalTime) {
        this.simTotalTime = simTotalTime;
    }

    public int getSimTotalTime() {
        return simTotalTime;
    }

    public void setSimTotalTime(int simTotalTime) {
        this.simTotalTime = simTotalTime;
    }
}
