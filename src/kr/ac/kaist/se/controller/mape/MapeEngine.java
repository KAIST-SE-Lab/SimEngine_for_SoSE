package kr.ac.kaist.se.controller.mape;

/**
 * An engine for enabling MAPE-loop for self-adaptation/reconfiguration
 * (M:Monitor, A:Analyze, P:Plan, E:Execute)
 *
 * @author ymbaek
 */
public class MapeEngine {

    private boolean isKnowledgeBase = false;    //if isKnowledgeBase is true, then MAPE-K is applied

    public void runMape(int curSimTick){
        runMonitoring();
        runAnalysis();
        runPlanning();
        runExecution();
    }

    private void runMonitoring(){

    }

    private void runAnalysis(){

    }

    private void runPlanning(){

    }

    private void runExecution(){

    }
}
