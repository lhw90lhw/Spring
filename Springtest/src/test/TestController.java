package test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse rest) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "스프링실행연습");
		mav.setViewName("/WEB-INF/jsp/result.jsp");
		return mav;
	}

}
