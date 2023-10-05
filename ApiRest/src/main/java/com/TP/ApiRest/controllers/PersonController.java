package com.TP.ApiRest.controllers;

import com.TP.ApiRest.entities.Persona;
import com.TP.ApiRest.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")

public class PersonController extends BaseControllerImpl<Persona,PersonaServiceImpl> {



}
