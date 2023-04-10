package com.easyimmo.mailsender.emailtemplate.repository;

import com.easyimmo.mailsender.emailtemplate.model.EmailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailTemplateRepository extends JpaRepository<EmailTemplate,Integer> {
}
