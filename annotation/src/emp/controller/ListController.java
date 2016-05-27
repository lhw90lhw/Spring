package emp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import emp.service.MyEmpService;
import emp.service.MyEmpServiceImpl;

public class ListController extends AbstractController {
	MyEmpService service;
	
	public ListController(MyEmpService service) {
		super();
		this.service = service;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userlist", service.getMemberList());
		mav.setViewName("emp/list");
		return mav;
	}

}
