package com.unbxd.tasks;

import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class Cli {
	
	private static Options options = new Options();
	 
	public static Options getOptions(){
		options.addOption("config", true, "config file to be used");
		options.addOption("task", true, "task file to be used");
		return options;
	}
	
	private Map<String, String> getCLIArgs(String[] cliArgs){
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = null;
		try {
			cmd = parser.parse(Cli.getOptions(), cliArgs);
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
		}
		return null;

		
	}
	
	
	
}
