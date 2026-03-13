package oslomet.data1700.DATA1700_demo_march;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    @GetMapping("/quote")
    public Map<String, String> someEndpoint() {
        return Map.of(
        "Quote 1", "If we go for what’s somewhat safe here, it’ll mean we never changed. - Sugawara Koushi",
        "Quote 2", "Aura, Kill Yourself - Frieren",
        "Quote 3", "Opportunities present themselves to those who have prepared - Tashiro Hidemi");
    }
}
