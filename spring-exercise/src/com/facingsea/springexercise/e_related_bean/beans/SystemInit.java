package com.facingsea.springexercise.e_related_bean.beans;

public class SystemInit {
	
	public SystemInit() {
		System.out.println("system init...");
		SystemInfo.taskPeroid = 1000 * 2;
	}

}
