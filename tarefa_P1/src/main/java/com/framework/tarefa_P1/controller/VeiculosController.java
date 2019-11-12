package com.framework.tarefa_P1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.framework.tarefa_P1.repository.Veiculos;

public class VeiculosController {
	
	@Autowired
	Veiculos veiculoTable;
	@GetMapping("/veiculos")
	public ModelAndView listar() {
		ModelAndView mv=new ModelAndView("ListagemVeiculo.html");
		mv.addObject("veiculos",veiculoTable.findAll());
		return mv;
	}
}
