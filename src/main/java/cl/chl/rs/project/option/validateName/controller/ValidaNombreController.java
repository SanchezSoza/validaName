package cl.chl.rs.project.option.validateName.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.chl.rs.project.option.validateName.service.ValidaNombreService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Controller
public class ValidaNombreController {

	@CrossOrigin
	@GetMapping(value = ValidaNombreURIConstants.VALIDARNOMBRE)
	@ApiOperation(value = "Valida el nombre ingresado", notes = "Retorna el nombre ingresado con la primera letra mayuscula")
	@ApiResponses({@ApiResponse(code = HttpServletResponse.SC_OK, message = "OK"),
		@ApiResponse(code = HttpServletResponse.SC_INTERNAL_SERVER_ERROR, message = "INTERNAL ERROR SERVER"),
		@ApiResponse(code = HttpServletResponse.SC_UNAUTHORIZED, message = "UNAUTHORIZED"),
		@ApiResponse(code = HttpServletResponse.SC_FORBIDDEN, message = "FORBIDDEN"),
		@ApiResponse(code = HttpServletResponse.SC_NOT_FOUND, message = "ELEMENTO NOT FOUND")
	})
	public @ResponseBody String validateNameData(@PathVariable String nombre) {
		String nombreAux = "";
		ValidaNombreService valida = new ValidaNombreService();
		nombreAux = valida.validaNombre(nombre);
		return nombreAux;
	}
}
