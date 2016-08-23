package Logging;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * Created by Admin on 21.08.2016.
 */
public class log4jExample {

    /* Get actual class name to be printed on */
    static Logger log = Logger.getLogger(log4jExample.class.getName());

    public static void main(String[] args)throws IOException,SQLException {
        //log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.warning("sadddddddddddddddddddddddddddddddd");


    }
}
