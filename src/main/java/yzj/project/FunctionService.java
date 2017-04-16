package yzj.project;

import org.springframework.stereotype.Service;

public class FunctionService {
	public String sayHello(String msg){
		return "Hello " + msg + " !";
	}
}
