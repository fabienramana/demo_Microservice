package fra.microservice.demo;

import org.springframework.web.bind.annotation.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

@RestController
public class DemoController {
    @GetMapping("")
    public String helloWorld() {
        return "32";
    }

    @PostMapping("/calcul")
    public Integer calculate(@RequestBody Calcul calcul) throws ScriptException
    {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        System.out.println(engine.eval(calcul.expression));
        Integer result = (Integer) engine.eval(calcul.expression);
        return result;

    }
}