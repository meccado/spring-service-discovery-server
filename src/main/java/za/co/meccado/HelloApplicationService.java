package za.co.meccado;

import java.util.*;
import java.util.Random;

import org.slf4j.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */

@RestController
@SpringBootApplication
public class HelloApplicationService 
{
	private static Logger log = LoggerFactory.getLogger(HelloApplicationService.class);
	
    public static void main( String[] args )
    {
    	SpringApplication.run(HelloApplicationService.class, args);
    }
    
    @RequestMapping(value= "/")
    public String home() {
    	log.info("Access /");
    	return "Hi!";
    }
    
    @RequestMapping(value= "/greetings")
    public String greetings() {
    	log.info("Access /greetings");
    	List<String> greetings = Arrays.asList("Hi there", "Greetngs", "Salutation");
    	Random random = new Random();
    	int index = random.nextInt(greetings.size());
    	return greetings.get(index);
    }
}
