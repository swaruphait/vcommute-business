package com.vareli.tecsoft.vcommute_business.config;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

@Component
public class MyAccessDeniedHandler implements AccessDeniedHandler{

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response,
            AccessDeniedException accessDeniedException) throws IOException, ServletException {
         Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth !=null) {
		response.sendRedirect(request.getContextPath()+ "/403");
	}else {
		response.sendRedirect(request.getContextPath() + "/404");
	} 
    }
    
}
