package com.unbxd.tasks;

/**
 * Singleton class which holds all the Tasks to be executed
 * @author arpan@unbxd.com
 */
public class TaskContainer{
	private static TaskContainer taskContainer = null;
	//private constructor
	private TaskContainer(){
		
	}
	
	static TaskContainer getTaskContainer(){
		if(taskContainer == null){
			taskContainer = new TaskContainer();
		}
		return taskContainer;
	}
	
	
}
