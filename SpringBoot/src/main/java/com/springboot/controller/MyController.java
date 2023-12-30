package com.springboot.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.model.Student;
import com.springboot.repository.StrudentRepo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@Controller
public class MyController {
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		ModelAndView mv=new ModelAndView("second");
		mv.addObject("k",k);
		return mv;
	}
	@RequestMapping("/urldata")
	public String urlData(HttpServletRequest req, HttpServletResponse res, @RequestParam String name, @RequestParam int age) throws ServletException, IOException {
		System.out.println("My name is "+name+", I am "+age+" years old");
		
		req.setAttribute("name", name);
		req.setAttribute("age", age);
		RequestDispatcher rd=req.getRequestDispatcher("urldata");
		rd.forward(req, res);
		return "urldata";
		
	}
	
	@RequestMapping("/addstudentfromurl")
	public ModelAndView addStudentFromUrl(Student student) {
		System.out.println(student);
		ModelAndView mv=new ModelAndView("urldata");
		mv.addObject("student",student);
		return mv;
	}

	@Autowired
	StrudentRepo repo;
	
	@RequestMapping("/addstudent")
//	@ResponseBody
	public String addStudent(Student student) {
		
		repo.save(student);
		return "index";
	}
	
	@RequestMapping("/getstudent")
	public ModelAndView getStudent(@RequestParam int id) {
		Student student = repo.findById(id).orElse(new Student());
		ModelAndView mv=new ModelAndView("second");
		mv.addObject("student", student);
		return mv;
	}
	@RequestMapping("/updatestudent")
	public ModelAndView updateStudent(@RequestParam int id,String name,int age) {
		Student student = repo.findById(id).orElse(new Student());
		student.setName(name);
		student.setAge(age);
		ModelAndView mv=new ModelAndView("second");
		mv.addObject("student",student);
		repo.save(student);
		return mv;
	}
	@RequestMapping("/deletestudent")
	public String deleteStudent(@RequestParam int id) {
		repo.deleteById(id);
		return "index";
		
	}
	
	
}
