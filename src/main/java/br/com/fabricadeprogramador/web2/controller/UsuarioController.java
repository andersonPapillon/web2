package br.com.fabricadeprogramador.web2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fabricadeprogramador.web2.model.Usuario;
import br.com.fabricadeprogramador.web2.repository.UsuarioRepository;

@RestController(value="/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuRepo;
	
	@PostMapping
	public Usuario inserir(@RequestBody Usuario usuario){
		return usuRepo.save(usuario);
	}
	
	@PutMapping
	public Usuario alterar(@RequestBody Usuario usuario){
		return usuRepo.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void excluir(@PathVariable("id") Integer id){
		usuRepo.delete(id);
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario buscaPorId(@PathVariable("id") Integer id){
		return usuRepo.findOne(id);
	}
	
	@GetMapping("/todos")
	public List<Usuario> buscaTodos(){
		return usuRepo.findAll();
	}

}
