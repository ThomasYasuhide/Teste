package br.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.model.Encomenda;
import br.com.model.Produto;

@Controller
public class Controlador {

	@RequestMapping("/teste")
	public ModelAndView teste(Encomenda encomendas){
		System.out.println(encomendas.getProdutos().size());
		
		for(int i=0; i<encomendas.getProdutos().size();i++){
			if(encomendas.getProdutos().get(i).getNome() != ""){
				
				Produto produto = new Produto();
				produto.setId(encomendas.getProdutos().get(i).getId());
				produto.setNome(encomendas.getProdutos().get(i).getNome());

				System.out.println(produto.getId());
				System.out.println(produto.getNome());
			}
		}
		
		
		
		return new ModelAndView("index");
	}
	
}
