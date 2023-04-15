package com.easyimmo.mailsender.infra.mail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.easyimmo.mailsender.infra.mail.entity.AutoEmailEntity;

@Repository
public interface AutoEmailJpaRepository extends JpaRepository<AutoEmailEntity, String> {
}
