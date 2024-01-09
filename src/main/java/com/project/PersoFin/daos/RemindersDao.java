package com.project.PersoFin.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PersoFin.models.Reminder;

public interface RemindersDao extends JpaRepository<Reminder, Long>{

}
