package com.project.PersoFin.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.PersoFin.models.user;

public interface userDao extends JpaRepository<user, Long>{

	
}
