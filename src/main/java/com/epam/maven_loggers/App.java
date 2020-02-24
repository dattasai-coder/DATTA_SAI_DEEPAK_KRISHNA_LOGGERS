package com.epam.maven_loggers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App
{
private static final Logger LOGGER=LogManager.getLogger(App.class);
double simpleInterest(double principleAmount ,int NoofYears,int Interest) {
LOGGER.info("Calculation of Simple_Interest");
    return (principleAmount * NoofYears * Interest)/100;
    }
    double compoundInterest(double principleAmount ,int NoofYears,int Interest) {
    LOGGER.info("Calculation of Compound_Interest");
        return principleAmount * Math.pow(1.0+Interest/100.0,NoofYears) - principleAmount;
    }
    public static void main(String args[]) {
    App ap=new App();
    LOGGER.info(ap.simpleInterest(50000,10,5));
    LOGGER.info(ap.compoundInterest(50000,10,5));
    }
}
