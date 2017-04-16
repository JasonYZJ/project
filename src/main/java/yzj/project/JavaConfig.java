package yzj.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public FunctionService functionService(){
		return new FunctionService();
	}
	
	@Bean
	public UseFucntionService useFucntionService(){
		UseFucntionService useFunctionService =  new UseFucntionService();
		useFunctionService.setFuctionService(functionService());
		return useFunctionService;
	}
}
