package com.lab7;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MessageMain {
	
	public static MessageService get1() {
		 AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("com.lab_7");
		appContext.refresh();
		MessageService messageService = (MessageService) appContext.getBean("MessageService");
		return messageService;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1-insert\n 2-update \n 3-delete \n 4-display \n 5-exit \n");
			int ch= sc.nextInt();
			if(ch==1) {
				MessageService messageService=get1();
				System.out.println("enter the id");
				int i= sc.nextInt();
				System.out.println("enter the Name");
				String i1= sc.next();
				
				messageService.save(i,i1);
			
			}
			else if(ch==2) {
				MessageService messageService=get1();
				System.out.println("enter the id");
				int i= sc.nextInt();
				System.out.println("enter the Name");
				String i1= sc.next();
				
				messageService.update(i,i1);
			}
			else if(ch==3) {
				MessageService messageService=get1();
				System.out.println("enter the id");
				int i= sc.nextInt();
				messageService.delete(i);
			}
			else if(ch==4) {
				MessageService messageService=get1();

				List<Message> al = messageService.getMessages();
				for (Message m : al) {
					System.out.println(m.getId() + " " + m.getMessage());
				}
				
			}
			else if(ch==5) {
				break;
			}
		}
		
		
		
	}
}
