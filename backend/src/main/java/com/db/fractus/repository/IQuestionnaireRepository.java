package com.db.fractus.repository;

import com.db.fractus.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuestionnaireRepository extends JpaRepository<Users, Integer>{
}
