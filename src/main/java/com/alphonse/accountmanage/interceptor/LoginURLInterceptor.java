package com.alphonse.accountmanage.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginURLInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getSession());
        String urlString = request.getRequestURI();
        if(urlString.endsWith("login.html")){
            return true;
        }
		if(request.getSession().getAttribute("username")==null) {
			response.sendRedirect("/loginPage");
			 System.out.println("访问了"+request.getContextPath());
		        return false;	
		}else {
			 System.out.println("登陆后也被拦截了");
			 //request.getSession().removeAttribute("username");
			return true;
		}
	        }

	public LoginURLInterceptor() {
		// TODO Auto-generated constructor stub
	}

}
