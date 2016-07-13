package com.example.spring;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.runner.ConfigRunner;
import com.example.spring.runner.JavaConfigRunner;
import com.example.spring.runner.XmlConfigRunner;

public class Application {
	public static void main(String[] args) {
		List<ConfigRunner> runnerList = new ArrayList<>();
		runnerList.add(new JavaConfigRunner());
		runnerList.add(new XmlConfigRunner());
		
		for(ConfigRunner configRunner : runnerList){
			configRunner.run();
			System.out.println();
		}
	}
}
