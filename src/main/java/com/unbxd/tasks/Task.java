package com.unbxd.tasks;

public interface Task {
	
	long getTaskId();
	String getTaskName();
	void prepare();
	void process();
	 
}
