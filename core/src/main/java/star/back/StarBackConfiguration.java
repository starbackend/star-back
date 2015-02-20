package star.back;

import org.cwatch.service.CwatchServiceConfiguration;
import org.cwatch.split.CwatchSplitConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:/star-back.properties"})
@Import({CwatchServiceConfiguration.class, CwatchSplitConfiguration.class})
public class StarBackConfiguration {
	
}
