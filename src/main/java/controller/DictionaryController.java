package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String index(){
        return "index";
    }
    @RequestMapping("/translate")
    public String translate(@RequestParam String word, Model model){
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao`");
        dictionary.put("dog", "con cho'");
        dictionary.put("cat", "con meo`'");
        dictionary.put("motorcycle", "xe may''");
        String result = dictionary.get(word);
        if (result != null){
            model.addAttribute("word", word);
            model.addAttribute("result", result);
        } else {
            model.addAttribute("word", word);
            model.addAttribute("result", "Not Found");
        }
        return "translate";
    }
}
