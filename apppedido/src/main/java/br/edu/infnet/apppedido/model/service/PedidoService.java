package br.edu.infnet.apppedido.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apppedido.model.domain.Pedido;
import br.edu.infnet.apppedido.model.domain.Usuario;
import br.edu.infnet.apppedido.model.repository.PedidoRepositoy;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepositoy pedidoRepository;
	
	public List<Pedido> obterLista(Usuario usuario){
		return pedidoRepository.obterLista(usuario.getId());
	}
	
	public List<Pedido> obterLista(){

		return (List<Pedido>) pedidoRepository.findAll();
	}
		
	public void incluir(Pedido pedido) {

		pedidoRepository.save(pedido);
	}
	
	public void excluir(Integer id) {
		pedidoRepository.deleteById(id);
	}

	public Pedido obterPorId(Integer id) {
		return pedidoRepository.findById(id).orElse(null);
	}	
	public Integer obterQtde() {
		return (int) pedidoRepository.count();
	}
}