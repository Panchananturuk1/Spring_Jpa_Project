package jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jpa.studentdata.StudentData;
import student.dao.StudentRepo;
import jpa.controller.StudentRepo2;


@Controller
public class StudentController {
	
	@Autowired
	StudentRepo2 repo2;
//	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(StudentData sdata) {
		
		repo2.save(sdata);
		return "home";
	}
	
//	@RequestMapping("/getStudent")
//	public ModelAndView getStudent(@RequestParam int sid) {
//		
//		ModelAndView mv = new ModelAndView("viewStudent");
//		StudentData sdata = repo2.findById(sid).orElse(new StudentData());
//		mv.addObject(sdata);
//		return mv;
//	}
	
	@RequestMapping("/getStudents")
	public ModelAndView getStudents(@RequestParam int sid) {
		
		ModelAndView mv = new ModelAndView("viewStudent");
		StudentData sdata = repo2.findById(sid).orElse(new StudentData());
		mv.addObject(sdata);
		return mv;
	}

}
