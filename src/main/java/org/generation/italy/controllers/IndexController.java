package org.generation.italy.controllers;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class IndexController {
	
	@GetMapping
	//@ResponseBody
	public String index(Model model) {
		String mioNome = "Jerome Branchetti";
		model.addAttribute("name", mioNome);
		
		
		return "index";
	}
	
	@GetMapping("/movies")
//	@ResponseBody
	public String movies(Model model) {
		model.addAttribute("movies",Arrays.asList("Sing 2","West Side Story","Supereroi","Chi ha incastrato Babbo Natale?\n" + 
				"","Diabolik","House of Gucci","Spider-Man: No Way Home","Stay Close","The Witcher"));
		return "movies";
	}
	
	@GetMapping("/songs")
//	@ResponseBody
	public String songs(Model model) {
		model.addAttribute("songs",Arrays.asList("Malibù ‑ Sangiovanni","Mi fai impazzire ‑ Blanco & Sfera Ebbasta","Mille ‑ Fedez & Achille Lauro & Orietta Berti","Stay - The Kid Laroi & Justin Bieber	","Zitti e buoni - Maneskin	","Musica leggerissima - Colapesce & Dimartino	","La canzone nostra - Mace & Blanco & Salmo","Rain On Me - Lady Gaga & Ariana Grande","Adore You - Harry Styles" ));
		return "songs";
	}

}
