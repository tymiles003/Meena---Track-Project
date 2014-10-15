package menaa.services;

/*import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
/*import org.springframework.web.bind.annotation.PathVariable;*/
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 
import menaa.beans.Driver;
import menaa.constants.RestUrlConstants;
 
/**
 * Handles requests for the Employee service.
 */
@Controller
public class DriverController {
     
    private static final Logger logger = LoggerFactory.getLogger(DriverController.class);
     
    
     
    @RequestMapping(value = RestUrlConstants.DRIVER_INFO, method = RequestMethod.POST,consumes="application/json",produces="application/json")
    public @ResponseBody Driver createEmployee(@RequestBody Driver driverInfo) {
        logger.info("Start createEmployee.");
       System.out.println("in "+ RestUrlConstants.DRIVER_INFO +" service");
        return driverInfo;
    }
    
    
    @RequestMapping(value = RestUrlConstants.GET_DRIVER_INFO, method = RequestMethod.GET)
    public @ResponseBody Driver getDriverDetails() {
        logger.info("get driver details.");
        Driver driverInfo = new Driver();
        driverInfo.setDriverFirstName("Gopal");
        driverInfo.setDriverLastName("Atla");
        System.out.println("in "+ RestUrlConstants.GET_DRIVER_INFO +" service");
        return driverInfo;
    }
     
   
}
