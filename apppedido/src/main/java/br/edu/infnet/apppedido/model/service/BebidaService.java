package br.edu.infnet.apppedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Bebida;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.BebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	private BebidaRepository bebidaRepository;

	public List<Bebida> obterLista(Usuario usuario){
		return (List<Bebida>) bebidaRepository.obterLista(usuario.getId());
	}
	public List<Bebida> obterLista(){
		return (List<Bebida>) bebidaRepository.findAll();
	}
	
	public void incluir(Bebida bebida) {
		bebidaRepository.save(bebida);
	}
	
	public void excluir(Integer id) {
		bebidaRepository.deleteById(id);
	}
	
	public Bebida obterPorId(Integer id) {
		return bebidaRepository.findById(id).orElse(null);
	}
}