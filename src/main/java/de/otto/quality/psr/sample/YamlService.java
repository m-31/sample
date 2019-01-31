package de.otto.quality.psr.sample;

import java.util.function.ToIntFunction;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("carlos")
public class YamlService {

	@Autowired
	private XltProperties xltProperties;

	public void print() {
		
		
		for (int i = 0; i < 10; i++) {
			int[] arr=createDurationRampup();
			System.out.println("xlt: ");
			System.out.println("  duration: " + arr[0]);
			System.out.println("  ramp-up: " + arr[1]);
			System.out.println("  http2-enabled: " + xltProperties.isHttp2Enabled());
		}

	}
	
	public int[] createDurationRampup()
	{
		double random;
		int[] arr=new int[2];
		random = Math.random();
		arr[0]=(int)(xltProperties.getDuration() + xltProperties.getDuration() * random);
		random = Math.random();
		arr[1]=(int)(xltProperties.getRampUp()+(arr[0] - xltProperties.getRampUp()) * random);
		return arr;
	}
	
	
	

}
