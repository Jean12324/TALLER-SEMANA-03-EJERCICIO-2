/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Taller_Semana_Nro_3_Ejer_2.controller;

import com.example.Taller_Semana_Nro_3_Ejer_2.model.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jeanc
 */
@Controller
public class EmpleadoController {
    @GetMapping("/formularioEmpleado")
    public String mostrarFormulario(Model model) {
        model.addAttribute("empleado", new Empleado()); 
        return "formulario_empleado"; 
    }

    @PostMapping("/guardarEmpleado")
    public String guardarEmpleado(Empleado empleado, Model model) {
        model.addAttribute("empleado", empleado);
        return "resultado_empleado"; 
    }
}
