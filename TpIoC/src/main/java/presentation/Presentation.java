package presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import metier.IMetier;

public class Presentation {

	public static void main(String[] args) {
	  ClassPathXmlApplicationContext context= 
			  new ClassPathXmlApplicationContext(new String[]{"config.xml"});
	  IMetier metier=(IMetier) context.getBean("metier");
	  System.out.println(metier.calcul());
	
	}

}
