package com.epam.maven_loggers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logger1
{
private static final Logger LOGGER=LogManager.getLogger(Logger1.class);
double houseRent(String standard,double area) {
	int costRequiredForMaterials;
	if(standard.equals("sm")) {
LOGGER.info("If standard of material is 'standard' and not automated house");
costRequiredForMaterials=1200;
}
	else if(standard.equals("asm"))
	{
		LOGGER.info("If standard of material is 'above standard' and not an automated house");
		costRequiredForMaterials=1500;
}
	else if(standard.equals("hsm"))
	{
		LOGGER.info("If standard of material is 'high standard' and is not an automated house");
		costRequiredForMaterials=1800;			
	}
else {
LOGGER.info("If standard of material is an automated house");
costRequiredForMaterials=2500;			
}
	double constructionCost=area*costRequiredForMaterials;
	return constructionCost;
	
}
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Logger1 ll=new Logger1();
    LOGGER.info(ll.houseRent("asm", 250.23));   
    }
}
