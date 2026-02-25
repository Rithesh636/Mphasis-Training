package com.test.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.MLATeamDAO1;
import com.test.dao.MLATeamDao;
import com.test.model.MLATeam;

public class TestDemo {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		MLATeamDao dao =ctx.getBean("tdao", MLATeamDao.class);
		MLATeamDAO1 dao1 =ctx.getBean("tdao1", MLATeamDAO1.class);
		
		MLATeam obj = new MLATeam();
		
		obj.setId(300);
		obj.setName("anush");
		obj.setSkill("cloud developer");
		obj.setManager("Bin laden");
		
		dao1.createMLATeam(obj);
		
		//dao.saveMLATeam(obj);
		List<MLATeam> list = dao.getAllMembers();
		list.forEach(System.out :: println);
		
//		dao.updateMLATeam(obj);
//		List<MLATeam> list1 = dao.getAllMembers();
//		list1.forEach(System.out :: println);
		
//		dao.deleteMLATeamMember(obj);
//		List<MLATeam> list1 = dao.getAllMembers();
//		list1.forEach(System.out :: println);
		
		
		System.out.println("Done..");
		
	}
}
