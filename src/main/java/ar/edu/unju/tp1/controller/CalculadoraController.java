package ar.edu.unju.tp1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.tp1.model.Calculadora;

@Controller
public class CalculadoraController {
	
	@Autowired
	Calculadora unaCalculadora;
	
	@GetMapping("/calculadora")
	public String getMenuCalculadora() {
		return("calculadora");
	}
	
	@GetMapping("/calculoSuma")
	public ModelAndView getCalculoSuma(@RequestParam (name = "num1") String num1, @RequestParam (name = "num2") int num2) {
		
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(num2);
		
		int resultadoSuma = unaCalculadora.sumar();
		
		ModelAndView modelView = new ModelAndView("resultado");  //devuelve la pagina llamada resultado
		modelView.addObject("resultadoSuma", resultadoSuma);
		
		return modelView;
		}
	
	@GetMapping("/calculoResta")
	public ModelAndView getRestaPage(@RequestParam (name = "num1") String num1, @RequestParam (name = "num2") int num2) {
		
		unaCalculadora.setNum1(Integer.valueOf(num1));
		unaCalculadora.setNum2(Integer.valueOf(num2));
		
		int resultadoResta = unaCalculadora.restar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoResta", resultadoResta);
		
		return modelView;
		}
	/*	
	@GetMapping("/calculoProducto")
	public ModelAndView getProductoPage(@RequestParam (name = "num1") String num1, @RequestParam (name = "num2") int num2) {
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(Double.valueOf(num2));
		
		double resultadoProducto = unaCalculadora.multiplicar();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoProducto", resultadoProducto);
		
		return modelView;
		}
	
	@GetMapping("/calculoCociente")
	public ModelAndView getCocientePage(@RequestParam (name = "num1") String num1, @RequestParam (name = "num2") int num2) {
		
		unaCalculadora.setNum1(Double.valueOf(num1));
		unaCalculadora.setNum2(Double.valueOf(num2));
		
		double resultadoCociente = unaCalculadora.dividir();
		
		ModelAndView modelView = new ModelAndView("resultado");
		modelView.addObject("resultadoCociente", resultadoCociente);
		
		return modelView;
		}
		*/

}
