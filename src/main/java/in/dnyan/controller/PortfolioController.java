package in.dnyan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PortfolioController.class);

	@GetMapping("/")
	public String rootContext() {
		LOG.info("Inside rootContext, redirecting to home");
		return "home";
	}
}
