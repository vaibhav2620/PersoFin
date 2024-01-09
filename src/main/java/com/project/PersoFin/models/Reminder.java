package com.project.PersoFin.models;

import java.time.LocalDateTime;

import com.project.PersoFin.enums.ReminderFrequency;
import com.project.PersoFin.enums.ReminderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reminders")

public class Reminder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long reminder_id;
	
    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;
	
	@Column
	private String remindertitle;
	
	@Column
	private LocalDateTime Rem_dateTime;
	
	@Column
	@Enumerated(EnumType.STRING)
	private ReminderFrequency reminderFrequency;
	
	@Column
	@Enumerated(EnumType.STRING)
	private ReminderStatus reminderStatus;
	
	public Reminder() {
		
	}
	

	public Reminder(long reminder_id, com.project.PersoFin.models.user user, String remindertitle,
			LocalDateTime rem_dateTime, ReminderFrequency reminderFrequency, ReminderStatus reminderStatus) {
		super();
		this.reminder_id = reminder_id;
		this.user = user;
		this.remindertitle = remindertitle;
		Rem_dateTime = rem_dateTime;
		this.reminderFrequency = reminderFrequency;
		this.reminderStatus = reminderStatus;
	}

	/**
	 * @return the user
	 */
	public user getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(user user) {
		this.user = user;
	}

	/**
	 * @return the reminder_id
	 */
	public long getReminder_id() {
		return reminder_id;
	}

	/**
	 * @param reminder_id the reminder_id to set
	 */
	public void setReminder_id(long reminder_id) {
		this.reminder_id = reminder_id;
	}



	/**
	 * @return the remindertitle
	 */
	public String getRemindertitle() {
		return remindertitle;
	}

	/**
	 * @param remindertitle the remindertitle to set
	 */
	public void setRemindertitle(String remindertitle) {
		this.remindertitle = remindertitle;
	}

	/**
	 * @return the rem_dateTime
	 */
	public LocalDateTime getRem_dateTime() {
		return Rem_dateTime;
	}

	/**
	 * @param rem_dateTime the rem_dateTime to set
	 */
	public void setRem_dateTime(LocalDateTime rem_dateTime) {
		Rem_dateTime = rem_dateTime;
	}

	/**
	 * @return the reminderFrequency
	 */
	public ReminderFrequency getReminderFrequency() {
		return reminderFrequency;
	}

	/**
	 * @param reminderFrequency the reminderFrequency to set
	 */
	public void setReminderFrequency(ReminderFrequency reminderFrequency) {
		this.reminderFrequency = reminderFrequency;
	}

	/**
	 * @return the reminderStatus
	 */
	public ReminderStatus getReminderStatus() {
		return reminderStatus;
	}

	/**
	 * @param reminderStatus the reminderStatus to set
	 */
	public void setReminderStatus(ReminderStatus reminderStatus) {
		this.reminderStatus = reminderStatus;
	}

	@Override
	public String toString() {
		return "Reminder [reminder_id=" + reminder_id  + ", remindertitle=" + remindertitle
				+ ", Rem_dateTime=" + Rem_dateTime + ", reminderFrequency=" + reminderFrequency + ", reminderStatus="
				+ reminderStatus + "]";
	}
	
	
	
}
