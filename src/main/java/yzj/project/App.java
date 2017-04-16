package yzj.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		UseFucntionService useFucntionService = context.getBean(UseFucntionService.class);
		
		System.out.println(useFucntionService.SayHello("java config"));
		context.close();
	}
}
