package main.java;

import org.apache.logging.log4j.*;

import java.io.*;
import java.sql.SQLException;

public class Main {
    private static Logger logger = LogManager.getLogger();

    static int number_of_values = 10;

    public static void main(String[] args) throws IOException, SQLException {
        logger.info(Fibonacci.calculate(number_of_values));


    }
}
