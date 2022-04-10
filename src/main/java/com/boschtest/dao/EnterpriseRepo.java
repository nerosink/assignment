package com.boschtest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.boschtest.model.Enterprise;

import java.util.List;

public interface EnterpriseRepo extends JpaRepository<Enterprise,Long>
{

}