package star.back;

import org.cwatch.activemq.CwatchActivemqConfiguration;
import org.cwatch.service.CwatchServiceConfiguration;
import org.cwatch.service.cdf.CwatchCdfForwardRouteBuilder;
import org.cwatch.split.CwatchSplitConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:/star-back.properties"})
@Import({
	CwatchSplitConfiguration.class, 
	CwatchServiceConfiguration.class,
	CwatchCdfForwardRouteBuilder.class, 
	CwatchActivemqConfiguration.class
})
public class StarBackConfiguration {
	
	
}
