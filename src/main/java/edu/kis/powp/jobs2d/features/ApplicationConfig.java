package edu.kis.powp.jobs2d.features;

public class ApplicationConfig {
	public static void configure(Feature ... f){
		for(Feature i : f){
			i.setup();
		}
	}
}
