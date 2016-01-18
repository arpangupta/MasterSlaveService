package com.unbxd.tasks;

import java.util.Map;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.unbxd.util.ConfigsLoader;

public class TaskEngine {
	
	private ConfigsLoader loader = null;
	private TaskContainer tasks = null;
	private TaskManager manager  = null;
	private static Logger log = LogManager.getLogger(TaskEngine.class.getName());
	
	public TaskEngine(String[] cliArgs){
		//get the config
		
		
	}
	

	
	public static void main(String[] args) {
		new TaskEngine(args);
	}
}
