
package application.mqttr;





import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import application.mqttr.service.Mqttservice;

@SpringBootApplication
public class App 
{
	@Autowired
	   public static Mqttservice mqttservice=new Mqttservice() ;  

	public static void main( String[] args ) throws MqttException
    {
		
	
		SpringApplication.run(App.class,args) ;
		
		mqttservice.client("tcp://[fe80::d81e:7d44:d4ed:5efc%17]:8883","12","#") ;
		
    }
}
