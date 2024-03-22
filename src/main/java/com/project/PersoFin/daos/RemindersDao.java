package com.project.PersoFin.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.*;

import com.project.PersoFin.models.Reminder;
import com.project.PersoFin.models.user;

public interface RemindersDao extends JpaRepository<Reminder, Long>{

//<Reminder> findallByUser(user user);
	@Modifying
	@Query(value="Select * from reminders where user_id=:id ",nativeQuery = true)
	public List<Reminder> findByUserID(int id);
	
}