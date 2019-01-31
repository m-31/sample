package de.otto.quality.psr.sample;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({ XltProperties.class })
public class SampleConfiguration {

	/*@Bean
	public YamlService yamlService() {
		return new YamlService();
	}*/

}
