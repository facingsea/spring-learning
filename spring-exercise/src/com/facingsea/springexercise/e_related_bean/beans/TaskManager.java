package com.facingsea.springexercise.e_related_bean.beans;

import java.util.Timer;
import java.util.TimerTask;

public class TaskManager {

	public TaskManager() {
		System.out.println("taskManager ....");
	}
	
	public void run() {
		System.out.println(SystemInfo.taskPeroid);
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("run ... ");
			}
		}, 0, SystemInfo.taskPeroid);
		
		//10s后结束
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			timer.cancel();
			System.out.println("Task manager end ... ");
		}
		
	}
}
