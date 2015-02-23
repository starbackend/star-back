package star.auto;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import star.back.StarBackConfiguration;

@Configuration
@Import(StarBackConfiguration.class)
public class StarBackAutoConfiguration {

}
