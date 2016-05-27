package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.service.MyEmpService;

public class SearchController extends AbstractController {
	MyEmpService service;
	
	public SearchController() {
		super();
	}
	
	public SearchController(MyEmpService service) {
		super();
		this.service = service;
	}
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
			String search = req.getParameter("search");
			ModelAndView mav = new ModelAndView();
			mav.addObject("userlist", service.findByAddr(search));
			mav.setViewName("emp/searchlist");
			return mav;
	}

}
