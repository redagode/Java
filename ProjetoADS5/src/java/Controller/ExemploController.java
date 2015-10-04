/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Business.Interface.IExemploBll;
import Entity.Exemplo;
import com.google.gson.Gson;
import javax.inject.Inject;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author matheusdsl
 */
@Controller
public class ExemploController {

    @Inject
    private IExemploBll ExemploBll;

    @RequestMapping("listar")
    public ResponseEntity<String> ExibeExemplo(@RequestParam int id) {
        Exemplo result = this.ExemploBll.Buscar();
        // do something interesting
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        String json = new Gson().toJson(result);
        return new ResponseEntity<String>(json, headers, HttpStatus.CREATED);
    }
    
    @RequestMapping("index")
    public String Index() {
       return "index";
    }
}
