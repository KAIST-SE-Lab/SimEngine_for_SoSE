package kr.ac.kaist.se.controller.sim;

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
    private SoS simModel;
    private SimConfiguration simConfig;
    private SimScenario simScenario;
    private boolean isMapeOn;
    private ArrayList<_SimRule_> simRules;

    /* Simulation Attributes */



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

        initLogger();
        writeSimEngineInfo();

        if (simModel == null){
            logger.warning("A simulation model (SimModel) is not given.");
        }else{
            this.simModel = simModel;
            this.isMapeOn = isMapeOn;
            this.simConfig = simConfiguration;
            this.simScenario = simScenario;
            this.simRules = simRules;
        }

    }


    /**
     * Method to start a simulation of simModel with given inputs
     * @return SimLog   log generated during a simulation
     */
    public SimLog startSimulation(){
        /* Example code for test */
        System.out.println("SIMULATION STARTED");

        logger.info("Sample Message1");
        logger.info("Sample Message2");

        System.out.println("SIMULATION FINISHED/TERMINATED");

        return null;
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
        System.out.println ( dTime );


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
        System.out.println ( dTime );

        logFile = new File("SimModelLog_" + dTime + ".log");

        try {
            outputWriter = new BufferedWriter(new FileWriter(logFile));

            timestamp = new Timestamp(System.currentTimeMillis());

            String currentPath = new java.io.File(".").getCanonicalPath();
            outputWriter.write(currentPath + "\\SimModelLog.log" + lineSeparator);
            outputWriter.write("> last update:" + timestamp + lineSeparator);
            outputWriter.write("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" + lineSeparator);
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
}
