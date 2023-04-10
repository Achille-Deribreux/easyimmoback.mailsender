package com.easyimmo.mailsender.autoemail.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyimmo.mailsender.autoemail.model.AutoEmail;

@Repository
public interface AutoEmailRepository extends JpaRepository<AutoEmail,Integer> {

    List<AutoEmail> findAllByPropertyId(Integer propertyId);
}
