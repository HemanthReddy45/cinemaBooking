package com.cinemaeBooking.configuration;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/*public class UserAuthenticationHandler implements AuthenticationSuccessHandler 
{

	private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException 
	{
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities)
		{
			if (grantedAuthority.getAuthority().equals("ROLE_USER")) 
            {
                redirectStrategy.sendRedirect(request, response, "/");
            } 
			else if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) 
            {
                redirectStrategy.sendRedirect(request, response, "/admin/main");
            }
		}
		
	}

}*/
