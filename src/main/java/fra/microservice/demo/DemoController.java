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
    @ResponseBody
    public String calculate(@RequestBody Calcul calcul) throws ScriptException
    {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "42+3";
        System.out.println(engine.eval(foo));
        return calcul.expression;

    }
}