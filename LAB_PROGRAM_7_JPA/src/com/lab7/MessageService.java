package com.lab7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MessageService")
public class MessageService {
	
	@Autowired
	MessageRepository repo;
	
	public void save(int id, String message) {
		Message m = new Message();
		m.setId(id);
		m.setMessage(message);
		repo.save(m);
	}
	
	public void update(int id, String message) {
		Message m = new Message();
		m.setId(id);
		m.setMessage(message);
		repo.save(m);
	}
	
	public void delete(int id) {
		Message m = new Message();
		m.setId(id);
		repo.delete(m);
	}
	
	public List<Message> getMessages(){
		List<Message> al = (List<Message>) repo.findAll();
		return al;
	}
	
	
	
	


}
