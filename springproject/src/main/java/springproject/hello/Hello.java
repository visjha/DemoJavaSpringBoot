package springproject.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "Hello, How are you doing";
	}
}
