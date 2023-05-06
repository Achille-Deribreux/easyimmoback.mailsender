package com.easyimmo.mailsender.infra.util;

import org.springframework.security.core.context.SecurityContextHolder;

public class UserUtil {

    private UserUtil() {
    }

    public static String getCurrentUserId(){
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }
}
