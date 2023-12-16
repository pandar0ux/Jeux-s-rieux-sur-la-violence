package fr.tyr;

import fr.tyr.game.GameEngine;
import fr.tyr.game.GameWindow;
import fr.tyr.game.GraphicEngine;
import fr.tyr.tools.LogFormatter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger logger;
    private static GameEngine gameEngine;

    public static void main(String[] args) {
        boolean devMode = false;
        if(args.length > 0)
            devMode = args[0].equals("--dev");
        setupLogger(devMode);
        logger.info("Creating game engine");
        gameEngine = new GameEngine(devMode);
        logger.info("Creating graphic engine");
        GraphicEngine graphicEngine = new GraphicEngine(gameEngine);
        logger.info("Creating game window");
        GameWindow gameWindow = new GameWindow(graphicEngine);
        gameWindow.add(graphicEngine);
        gameWindow.setVisible(true);
        logger.info("Game initialized");
    }

    /**
     * Create the logger with the good level of logging
     * @param devMode if true, the logger will log everything, else it will only log warnings and errors
     */
    private static void setupLogger(boolean devMode){
        logger = Logger.getLogger(Main.class.getName());
        logger.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(devMode ? Level.ALL : Level.WARNING);
        consoleHandler.setFormatter(new LogFormatter());
        logger.addHandler(consoleHandler);
    }

    public static Logger getLogger() {
        return logger;
    }

    public static GameEngine getGameEngine() {
        return gameEngine;
    }
}
