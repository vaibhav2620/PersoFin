package com.project.PersoFin.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.PersoFin.daos.RemindersDao;
import com.project.PersoFin.models.Reminder;

@Service
public class ReminderService {

	@Autowired
	private RemindersDao reminderDao;
	
	
	
	public Reminder setReminder(Reminder reminder) {
		
		return reminderDao.save(reminder);
	}
	
	public List<Reminder> getAllreminders(int UserID){
		
		return reminderDao.findAll();
	}
	
	public List<Reminder> getreminderbyUserID(int id){
		
		return reminderDao.findByUserID(id);
	}
	
}