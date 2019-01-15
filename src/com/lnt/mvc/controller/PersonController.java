package com.lnt.mvc.controller;

import java.util.Date;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.lnt.mvc.dao.AnnouncementDAO;
import com.lnt.mvc.dao.DepartmentDAO;
import com.lnt.mvc.dao.EmployeeAnnualLeaveDAO;
import com.lnt.mvc.dao.EmployeeDAO;
import com.lnt.mvc.dao.FeedbackDAO;
import com.lnt.mvc.dao.JobsDAO;
import com.lnt.mvc.dao.LeaveMasterDAO;
import com.lnt.mvc.exception.CustomException;
import com.lnt.mvc.model.Announcement;
import com.lnt.mvc.model.Department;
import com.lnt.mvc.model.EmployeeAnnualLeave;
import com.lnt.mvc.model.EmployeeDetails;
import com.lnt.mvc.model.Feedback;
import com.lnt.mvc.model.Job;
import com.lnt.mvc.model.LeaveMaster;
import com.lnt.mvc.model.Person;
import com.lnt.mvc.service.IPersonService;

@Controller
@SessionAttributes(value = "sessionuser")
public class PersonController {
	private IPersonService personService;
	private EmployeeDAO edao;

	private JobsDAO jdao;

	private DepartmentDAO ddao;
	private AnnouncementDAO adao;


	private EmployeeAnnualLeaveDAO empdao;
	private LeaveMasterDAO ldao;
	private FeedbackDAO fdao;

	@Autowired
	@Qualifier(value = "fbDao")
	public void setFdao(FeedbackDAO fdao) {
		this.fdao = fdao;
	}
	

	@Autowired
	@Qualifier(value = "aDao")
	public void setAdao(AnnouncementDAO adao) {
		this.adao = adao;
	}



	@Autowired
	@Qualifier(value = "lvDao")
	public void setLdao(LeaveMasterDAO ldao) {
		this.ldao = ldao;
	}

	@Autowired
	@Qualifier(value = "ealDao")
	public void setEmpdao(EmployeeAnnualLeaveDAO empdao) {
		this.empdao = empdao;
	}

	@Autowired
	@Qualifier(value = "deptDao")
	public void setEdao(DepartmentDAO edao) {
		this.ddao = edao;
	}

	@Autowired
	@Qualifier(value = "jobDao")
	public void setEdao(JobsDAO edao) {
		this.jdao = edao;
	}

	@Autowired
	@Qualifier(value = "empDao")
	public void setEdao(EmployeeDAO edao) {
		this.edao = edao;
	}

	@Autowired
	@Qualifier(value = "personService")
	public void setPersonService(IPersonService ps) {
		this.personService = ps;
	}
	
	@RequestMapping(value = "/announcementhr", method = RequestMethod.GET)
	public String ann() {
		return "announcement";
	}
	

	/*@ExceptionHandler(CustomException.class)
	public ModelAndView handlePersonNotFoundException(CustomException ex) {
		Map<String, CustomException> model = new HashMap<String, CustomException>();
		model.put("exception", ex);
		return new ModelAndView("error", model);

	}*/

	@ExceptionHandler(Exception.class)
	public ModelAndView handleException(Exception ex) {
		Map<String, Exception> model = 
				new HashMap<String, Exception>();
		model.put("exception", ex);
		return new ModelAndView("error", model);

	}
	@RequestMapping(value = "/persons", method = RequestMethod.GET)
	public String listPersons(Model model) {
		model.addAttribute("person", new Person());// model
		model.addAttribute("listPersons", this.personService.listPersons());
		return "person";// view name
	}

	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String indexes() {
		return "login";
	}

	@RequestMapping(value = "/Applyleave", method = RequestMethod.GET)
	public String applyleavess() {
		return "applyleavehr";
	}
	
	@RequestMapping(value = "/formsubmit", method = RequestMethod.GET)
	public String a() {
		return "employee";
	}
	
	@RequestMapping(value = "/eventsann", method = RequestMethod.GET)
	public String ab() {
		return "events";
	}

	@RequestMapping(value = "/Leavehr", method = RequestMethod.GET)
	public String leaveshrs() {
		return "leavehr";
	}

	@RequestMapping(value = "/SearchEmp", method = RequestMethod.GET)
	public String empserach() {
		return "search";
	}
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/AdminForms", method = RequestMethod.POST)
	public ModelAndView admpro(HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("adm") Person u) {
		ModelAndView mav = null;
		int id = u.getUserid();
		String pwd = u.getPassword();
		System.out.println(id + " " + pwd);
		Person p = personService.getPersonById(id);
		System.out.println(p);
		String pw = p.getPassword();
		int id1 = p.getUserid();
		if ((pw.equals(pwd) && (id == id1))) {
			mav = new ModelAndView("admi");
			return mav;
		} else {
			mav = new ModelAndView("loginerror");
			return mav;
		}

	}

	@RequestMapping(value = "/ApplyLeaveHR", method = RequestMethod.POST)
	public ModelAndView ealpro(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("Leaves") EmployeeAnnualLeave e) {
		System.out.println("inside the contoller");
		ModelAndView mav = null;

		System.out.println(e);

		int id1 = e.getMaster_id();

		LeaveMaster lm = ldao.getbyId(id1);
		e.setLeavemaster(lm);
		System.out.println(lm);

		int ldr = lm.getLeavedaysallowed();

		e.setLdr(ldr);

		System.out.println(ldr);

		e.setLeavestatus("Not Approved");

		EmployeeDetails emp = edao.getEmployeeDetails(e.getEmployee_id());

		e.setEmployee(emp);

		System.out.println(e);

		empdao.createEmployeeAnnualLeaveDAO(e);

		mav = new ModelAndView("leave");

		return mav;
	}

	@RequestMapping(value = "/LoginForms", method = RequestMethod.POST)
	public ModelAndView loginpro(HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("login") EmployeeDetails u, BindingResult result, Model model, HttpSession httpsession) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("sessionuser", u);

		httpsession.setAttribute("EmployeeId", u.getEmployee_id());
		int time = (int) httpsession.getAttribute("EmployeeId");
		httpsession.setAttribute("role", u.getEmployee_id());
		System.out.println("time=" + time);

		if (time == u.getEmployee_id()) {

			int id = u.getEmployee_id();
			String pwd = u.getPassword();
			System.out.println(id + " " + pwd);
			EmployeeDetails p = edao.getEmployeeDetails(id);
			System.out.println(p);
			String pw = p.getPassword();
			int id1 = p.getEmployee_id();

			int jobid = p.getJobId();
			if ((pw.equals(pwd) && (id == id1))) {
				if (jobid == 1) {
					mav = new ModelAndView("hr");
					return mav;
				} else {
					mav = new ModelAndView("employee");
					return mav;
				}
			}

		}

		return mav;

	}

	@RequestMapping(value = "/Edit", method = RequestMethod.GET)
	public String Editing() {
		return "edit";
	}

	@RequestMapping(value = "/New", method = RequestMethod.GET)
	public String newemp() {
		return "admin";
	}

	@RequestMapping(value = "/Admin", method = RequestMethod.GET)
	public String admin() {
		return "admin";
	}

	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String reg() {
		return "register";
	}

	

	/* Controller for searching */
	@RequestMapping(value = "/SearchForm", method = RequestMethod.POST)
	public String searchemp(Model model, HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("Search") EmployeeDetails u) {
		System.out.println(u);
		String name = u.getFirstName();
		System.out.println(name);
		List<EmployeeDetails> emp = this.edao.getByNameEmp(name);
		model.addAttribute("person", new EmployeeDetails());// model
		model.addAttribute("listemployees", emp);
		return "search";//
	}

	/* Feedback form for HR */
	@RequestMapping(value = "/feedhrform", method = RequestMethod.POST)
	public String feedhrform1(Model model, HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("feedformhr") Feedback f) {
		System.out.println(f);
		int id = f.getEmployee_id();
		System.out.println(1);
		EmployeeDetails e = edao.getEmployeeDetails(id);
		System.out.println(2);
		f.setEmployee(e);
		System.out.println(3);
		System.out.println(f);
		fdao.createFeedback(f);
		System.out.println(4);

		return "feedbackhr";//
	}


	/* View for Leave */

	@RequestMapping(value = "/Leave", method = RequestMethod.GET)
	public String leave() {
		return "leave";
	}

	/* controller for feedback */

	@RequestMapping(value = "/feedhr", method = RequestMethod.GET)
	public String feedbackhr() {
		return "feedbackhr";
	}

	/* Controller for Leave */

	@RequestMapping(value = "/LeaveForm", method = RequestMethod.POST)
	public String leave(Model model, HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("leave") EmployeeDetails u) {

		System.out.println(u);
		String name = u.getFirstName();
		System.out.println(name);
		List<EmployeeDetails> emp = this.edao.getByNameEmp(name);
		model.addAttribute("person", new EmployeeDetails());// model
		model.addAttribute("listemployees", emp);
		return "";//
	}

	// For add and update person both
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	// @ExceptionHandler({ CustomException.class })
	public String addPerson(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("reg") EmployeeDetails p) {
		System.out.println(p);
		/*
		 * p.setHiredate(new Date());
		 */ System.out.println(p.getHiredate());
		System.out.println("Inside addperson 0");
		int deptid = p.getDepartment_id();
		int jobId = p.getJobId();
		System.out.println("Inside addperson 1");
		Department d = ddao.getDeptById(deptid);
		System.out.println("Inside addperson 12");

		List<EmployeeDetails> empl = d.getEmployee();
		System.out.println(empl);
		empl.add(p);
		d.setEmployee(empl);
		System.out.println(empl);
		System.out.println("Inside addperson 2");
		Job j = jdao.getJob(jobId);
		System.out.println(j);
		List<EmployeeDetails> emp = j.getEmployees();
		System.out.println(emp);
		emp.add(p);
		System.out.println(emp);
		j.setEmployees(emp);
		// new person, add it
		System.out.println("Inside addperson 3");

		this.edao.createEmployeeDetails(p);

		ddao.updateDepartment(d);
		jdao.updateJob(j);
		System.out.println("Inside addperson 4");
		// existing person, call update

		return "admi";

	}
	
	/*Announcement*/
	@RequestMapping(value ="/announcements", method = RequestMethod.POST)
	public String ann(Model model, HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("annhr") Announcement a) {
		System.out.println(a);
		a.setDate(new Date());
		System.out.println(a);
		adao.createAnnouncement(a);
		
		return "announcement";//
	}
	
	
	/*Announcement View for Employee*/
	@RequestMapping(value = "/announcementemp", method = RequestMethod.POST)
	public String announemp(Model model, HttpServletRequest request, HttpServletResponse response) {
	
		
		List<Announcement> b= this.adao.getAllAnnouncement();
		model.addAttribute("person", new Announcement());// model
		model.addAttribute("listemployees", b);
		return "annonemp";//
	}
	
	
	

	@RequestMapping("/remove/{id}")
	//@ExceptionHandler({ CustomException.class })
	public String removePerson(@PathVariable("id") int id) throws CustomException {
		if (id > 0) {
			throw new CustomException("Given Id Not Found", "404");
		} else {
			this.personService.removePerson(id);
		}
		return "redirect:/persons";
	}

	@RequestMapping(value = "/edit/{employee_id}")
	public String showEditPersonPage(@PathVariable("employee_id") Integer id, @Valid EmployeeDetails e,
			BindingResult result, Model model) {
		EmployeeDetails em = edao.getEmployeeDetails(id);
		model.addAttribute("person", em);
		System.out.println("HI");

		return "edit";// view name
	}

	@RequestMapping(value = "/Editemp")
	public String showEdit(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("editemployee") EmployeeDetails e) {
		System.out.println("AA GAYA");
		System.out.println(e);
		edao.updateEmployeeDetails(e);
		return "search";// view name
	}

	@RequestMapping("/showErrorPage/error")
	@ExceptionHandler(ArrayIndexOutOfBoundsException.class)
	public ModelAndView exception(ArrayIndexOutOfBoundsException e) {

		ModelAndView mav = new ModelAndView("error");// view name
		mav.addObject("exName", e.getClass().getSimpleName());// model for ex name
		mav.addObject("exMessage", e.getMessage());// model for ex msg
		return mav;
	}
}
