package de.otto.quality.psr.sample;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@Import(SampleConfiguration.class)
public class TestYamlService {

	/*
	 * @Before public void setUp() throws Exception { yamlService = new
	 * YamlService(); }
	 */

	@Autowired
	private YamlService yamlService;

	@Test
	public void testCreateDurationRampup() {
		for (int i = 0; i < 10; i++) {
			int[] arr = yamlService.createDurationRampup();
			if (arr[1] > arr[0]) {
				fail("RampUp bigger than duration");
			}

		}

	}

}
