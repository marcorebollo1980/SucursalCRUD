package com.sucursal.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sucursal.crud.entities.Sucursal;
import com.sucursal.crud.repository.SucursalRepository;


@RestController
@RequestMapping("/api/sucursal")
@ComponentScan("com.sucursal.crud")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.OPTIONS})
public class SucursalController {
	
	@Autowired
	private SucursalRepository sucursalRepository;
	
	
	@GetMapping("/sucursales")
	public List<Sucursal> getAllSucursales(){
		return sucursalRepository.findAll();
	}
	
	@PostMapping("/agregarSucursal")
	public Sucursal agregarSucursal(@Valid @RequestBody Sucursal sucursal){
		return sucursalRepository.save(sucursal);
		
	}
	
	@GetMapping("/buscarSucursal/{id}")
	public Optional<Sucursal> buscarSucursal(@PathVariable(value="id") Long id){
		return sucursalRepository.findById(id);
	}
	
	
	
	

}
