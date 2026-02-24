package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookDemo {
		public static void main(String[] args) {
			
			//XML CONFIGURATION
			//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
			//Book b = (Book)ctx.getBean("bk");
			//System.out.println(b);
			
			//ANNOTATION CONFIGURATION
			ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
			BookDetails b1 = ctx.getBean(BookDetails.class);
			Book b2 = ctx.getBean(Book.class);
			
			b1.setPages(2200);
			b1.setPublisher("Raychu");
			b1.setPyear(2026);
			
			List<BookDetails> list = new ArrayList<>();
			list.add(b1);
			
			b2.setId(201);
			b2.setAuthor("Ali baba");
			b2.setName("Find your goal");
			b2.setPrice(2000);
			b2.setListbd(list);
			
			System.out.println(b2);
		}
}
