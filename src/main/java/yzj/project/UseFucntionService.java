package yzj.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class UseFucntionService {
	FunctionService functionService;
	
	public String SayHello(String hello){
		return functionService.sayHello(hello);
	}
	
	public void setFuctionService(FunctionService functionService){
		this.functionService = functionService;
	}
}
