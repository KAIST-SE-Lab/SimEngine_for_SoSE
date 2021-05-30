package kr.ac.kaist.se.controller.sim;

import kr.ac.kaist.se.controller.mape.MapeEngine;
import kr.ac.kaist.se.controller.util.map.MapManager;
import kr.ac.kaist.se.controller.util.scenario.ScenarioManager;
import kr.ac.kaist.se.model.simdata.input.configuration.SimConfiguration;
import kr.ac.kaist.se.model.simdata.input.rule._SimRule_;
import kr.ac.kaist.se.model.simdata.input.scenario.SimScenario;
import kr.ac.kaist.se.model.simdata.output.SimLog;
import kr.ac.kaist.se.model.simmodel.SoS;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Simulation engine for a simulation of a simulation model
 * Discrete-time evnt-based simulation
 *
 * @author ehcho, yjshin, ymbaek
 *
 * inputs:
 *      simModel: SoS (Simulation Model)
 *      isMapeOn: MapeMode (isMapeOn)
 *      simConfig: Simulation Configuration
 *      simScenario: Simulation Scenario
 */
public class SimEngine {

    /* Version of this simEngine module */
    private static String simEngineVer = "ver0.0.10";

    /* Timestamp for Logging/Snapshots */
    private Timestamp timestamp;

    /* Variables for Standard Java Log Outputs of SimEngine */
    private static final String logFormat = "[%1$tF %1$tT] [%2$-7s] %3$s %n";
    private final Logger logger = Logger.getLogger("Simulation Engine Logger");
    private FileHandler fileHandler;

    /* Record of SimLogEvents */
    private BufferedWriter outputWriter = null;
    private final String lineSeparator = System.getProperty("line.separator");
    private File logFile = new File("SimModelLog.log");


    /* Simulation Inputs */
    private SoS simModel;                   // Simulation model
    private SimConfiguration simConfig;     // Simulation configuration
    private SimScenario simScenario;        // Simulation scenario
    private ArrayList<_SimRule_> simRules;  // Rules / Policies

    private boolean isMapeOn;               // Whether MAPE-loop is executed
    private MapeEngine mapeEngine;          // MAPE engine

    /* Simulation Attributes */
    private int simTotalTime;               // Total time allowed for a single simulation
    private int simCurTick = 0;             // Current time tick


    /* Utilities */
    private ScenarioManager scenarioManager;
    private MapManager mapManager;


    /**
     * Constructor of SimEngine
     *
     * @param simModel
     * @param isMapeOn
     * @param simScenario
     * @param simConfiguration
     * @param simMapInitFile
     * @param simRules
     */
    public SimEngine(SoS simModel,
                     boolean isMapeOn,
                     SimScenario simScenario,
                     SimConfiguration simConfiguration,
                     String simMapInitFile,
                     ArrayList<_SimRule_> simRules) {

        // Initialize loggers and write SimEngine information into the log file
        initLogger();
        writeSimEngineInfo();

        // Write/print simEngine version into the log file
        logger.info("Version of SimEngie: " + simEngineVer);
        System.out.println("[" + this.getClass().getSimpleName() + "] Version of SimEngie: " + simEngineVer);

        // Initialize simulation engine with inputs
        initSimEngine(simModel, isMapeOn, simScenario, simConfiguration, simMapInitFile, simRules);

    }


    /**
     * Method to start a simulation of simModel with given inputs
     * @return SimLog   log generated during a simulation
     */
    public SimLog startSimulation(){

        System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] SIMULATION STARTED.");
        logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] SIMULATION STARTED.");

        System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");
        logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");

        /**
         * Discrete event/time simulation
         * curTick: current time tick, simTotalTime: total time allowed for simulation
         *
         * For each tick (curTick), PHASE01 ~ PHASE05 are sequentially executed
         */
        for (int curTick = 0; curTick < this.simTotalTime; curTick++){
            simCurTick = curTick;

            System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] curSimTick: " + simCurTick);
            logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] curSimTick: " + simCurTick);
            System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");
            logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");


            /**
             * PHASE 01: Execute SimScenarioUnivEvent of a given SimScenario
             */

            /**
             * PHASE 02: Collect RunResults by running SimModel (and its objects)
             */

            /**
             * PHASE 03: Resolve conflicts of the RunResult of the current tick
             */

            /**
             * PHASE 04: Collect communication actions (CommActions) to process message-sending
             */

            /**
             * PHASE 05: Update SimModel by actually executing the action objects after resolving conflicts (PHASE03)
             */

        }



        System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");
        logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] ──────────────────────────────────────────────────────────────────");

        //TODO: Summary of Simulation

        System.out.println("[" + this.getClass().getSimpleName() + ":startSimulation()] SIMULATION FINISHED/TERMINATED.");
        logger.info("[" + this.getClass().getSimpleName() + ":startSimulation()] SIMULATION FINISHED/TERMINATED.");
        return null;
    }




    /**
     * A method to initialize SimEngine
     *
     * @param simModel          Simulation model to be simulated
     * @param isMapeOn          Mape mode (T/F)
     * @param simScenario       Simulation scenario to be executed by this SimEngine
     * @param simConfiguration  Simulation configuration for this simulation
     * @param simMapInitFile    Map initialization file to initialize an SoSMap of SimModel
     * @param simRules          A list of rules (policies) to be simulated
     */
    private void initSimEngine(SoS simModel,
                               boolean isMapeOn,
                               SimScenario simScenario,
                               SimConfiguration simConfiguration,
                               String simMapInitFile,
                               ArrayList<_SimRule_> simRules){

        //Initialize simModel (simModel is a mandatory input)
        if (simModel != null){
            initSimModel(simModel, simMapInitFile);

            System.out.println("[" + this.getClass().getSimpleName() + ":initSimEngine()] simModel is initialized.");
            logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] simModel is initialized.");

            this.isMapeOn = isMapeOn;

            //Make an instance of MapeEngine if isMapeOn is true
            if (isMapeOn){
                mapeEngine = new MapeEngine();
            }

            //Initialize simScenario
            if (simScenario != null){
                initSimScenario(simScenario);

                System.out.println("[" + this.getClass().getSimpleName() + ":initSimEngine()] simScenario is initialized.");
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] simScenario is initialized.");
            }else{
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] A simulation scenario (SimScenario) is not given.");
            }

            //Initialize simModel
            if (simConfiguration != null){
                initSimConfiguration(simConfiguration);

                System.out.println("[" + this.getClass().getSimpleName() + ":initSimEngine()] simConfiguration is initialized.");
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] simConfiguration is initialized.");
            }else{
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] A simulation configuration (SimConfiguration) is not given.");
            }

            //Initialize simModel
            if (simRules != null){
                initSimRules(simRules);

                System.out.println("[" + this.getClass().getSimpleName() + ":initSimEngine()] simRules are initialized.");
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] simRules are initialized.");
            }else{
                logger.info("[" + this.getClass().getSimpleName() + ":initSimEngine()] Simulation rules (SimRules) is not given.");
            }
        }else{
            //If there is no simulation model, warning message is logged.
            logger.warning("[" + this.getClass().getSimpleName() + ":initSimEngine()] A simulation model (SimModel) is not given.");
        }


    }

    /**
     * A method to initialize
     * @param simModel  Simulation model to be simulated
     */
    private void initSimModel(SoS simModel, String simMapInitFile){
        this.simModel = simModel;

        //If there is a map initialization file, initialize SoSMap based on the simMapInitFile
        if (simMapInitFile != null){
            //simModel.getSoSMap().initMap(simMapInitFile);
        }
    }

    /**
     * A method to initialize
     * @param simScenario   Simulation scenario to be executed by this SimEngine
     */
    private void initSimScenario(SimScenario simScenario){
        this.simScenario = simScenario;

        //TODO: Read scenario using ScenarioManager
        scenarioManager = new ScenarioManager();
    }

    /**
     * A method to initialize
     * @param simConfiguration  Simulation configuration for this simulation
     */
    private void initSimConfiguration(SimConfiguration simConfiguration){
        this.simConfig = simConfiguration;

        //Set the total time allowed for simulation based on simConfiguration
        simTotalTime = simConfig.getSimTotalTime();
    }

    /**
     * A method to initialize
     * @param simRules  A list of rules (policies) to be simulated
     */
    private void initSimRules(ArrayList<_SimRule_> simRules){
        this.simRules = simRules;
    }


    /**
     * A method to initialize SimEngine logger
     * The logger automatically stores logs into a specified file
     * @return
     */
    private boolean initLogger(){
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd_HH-mm-ss", Locale.KOREA );
        Date currentTime = new Date ( );
        String dTime = formatter.format ( currentTime );


        try {
            fileHandler = new FileHandler("SimEngineLog_" + dTime + ".log");
            logger.addHandler(fileHandler);
            logger.setUseParentHandlers(false);

            fileHandler.setFormatter(new SimpleFormatter() {
                @Override
                public synchronized String format(LogRecord lr) {
                    return String.format(logFormat,
                            new Date(lr.getMillis()),
                            lr.getLevel().getLocalizedName(),
                            lr.getMessage()
                    );
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


    /**
     * A method to write meta-information of SimEngine log file
     */
    private void writeSimEngineInfo(){
        SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd_HH-mm-ss", Locale.KOREA );
        Date currentTime = new Date ( );
        String dTime = formatter.format ( currentTime );

        logFile = new File("SimModelLog_" + dTime + ".log");

        try {
            outputWriter = new BufferedWriter(new FileWriter(logFile));

            timestamp = new Timestamp(System.currentTimeMillis());

            String currentPath = new java.io.File(".").getCanonicalPath();
            outputWriter.write(currentPath + "\\SimModelLog.log" + lineSeparator);
            outputWriter.write("> last update: " + timestamp + lineSeparator);
            outputWriter.write("> simEngine ver: " + simEngineVer + lineSeparator);
            outputWriter.write("──────────────────────────────────────────────────────────────────" + lineSeparator);
            outputWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * A method to write a message into SimEngine log file
     * @param logMsg    a message to be written in the file
     * @return          true if a message is successfully written
     */
    private boolean writeLogToFile(String logMsg){
        if (!logFile.exists()) {
            System.out.println("no file");
            return false;
        }

        try {
            timestamp = new Timestamp(System.currentTimeMillis());
            outputWriter.write(logMsg + lineSeparator);
            outputWriter.flush();

            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

//    /**
//     * A method to get the name of currently running method
//     * @return  Method name
//     */
//    private static String getCurMethodName(){
//        return Thread.currentThread().getStackTrace()[1].getMethodName();
//    }
}
