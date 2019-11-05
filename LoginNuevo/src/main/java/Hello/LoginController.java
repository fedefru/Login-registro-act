package Hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@Autowired
	DummyService service;
	DummyBase base;
	

	
	// <'/login'> ruta de escucha, para que atienda peticiones 'Get' en el directorio raiz
	@GetMapping("/login")
	public String createUsuario(Model model) {
		//se instancia un objeto 'Usuario' con el nombre 'usuario' a login.html
		model.addAttribute("usuario", new Usuario());
		return "login";// hace referencia a 'login.html' una vista
	}

	@PostMapping("/login")
	public String readUser(@ModelAttribute Usuario usuario) {
		
		if (service.getAtribute(usuario.getUser(), usuario.getPass())) {
			return "okLogin";
		} else {
			return "btn_registro";
		}

	}
	
	@GetMapping("/registro")
	public String createUsuario1(Model model) {
		//se instancia un objeto 'Login' con el nombre 'nuevo' a login.html
		System.out.println("AAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAA");
		System.out.println("AAAAAAAAAAAAAA");
		model.addAttribute("usuario", new Usuario());
		
		
		return "registro";// hace referencia a 'login.html' una vista
	}

	@PostMapping("/registro")
	public String readUser1(@ModelAttribute Usuario usuario) {
		service.registerUser(usuario.getUser(), usuario.getPass());
		return "okLogin";
	}
	
	
	
}
