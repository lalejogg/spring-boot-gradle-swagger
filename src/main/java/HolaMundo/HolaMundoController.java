package HolaMundo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundoController {

    @RequestMapping("/HelloWorld")
    public HolaMundo holaMundo(
        @RequestParam(value="user", defaultValue="Usuario") String userName) {
        return new HolaMundo(userName);
    }

    @RequestMapping("/")
    public String inicio() {
        return "Pagina de Inicio";
    }
}