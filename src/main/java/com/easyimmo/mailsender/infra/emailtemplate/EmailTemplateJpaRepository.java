package com.easyimmo.mailsender.infra.emailtemplate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTemplateJpaRepository extends JpaRepository<EmailTemplateEntity, Integer> {
}
