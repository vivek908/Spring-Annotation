package com.vivek.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor 
{
	public void process() 
	{
		System.out.println("world best CPU");
	}

}
