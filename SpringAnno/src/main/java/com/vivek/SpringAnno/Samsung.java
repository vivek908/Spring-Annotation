package com.vivek.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Non qualified and De capitalized
public class Samsung {
	@Autowired
	@Qualifier("mediaTek")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}
	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}
	public void config(){
		System.out.println("Octa Core,4 gb Ram, 12MP camera");
		cpu.process();
	}
}
