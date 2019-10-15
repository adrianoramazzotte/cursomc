package com.ramazzotte.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ramazzotte.cursomc.domain.Categoria;
import com.ramazzotte.cursomc.domain.Cidade;
import com.ramazzotte.cursomc.domain.Cliente;
import com.ramazzotte.cursomc.domain.Endereco;
import com.ramazzotte.cursomc.domain.Estado;
import com.ramazzotte.cursomc.domain.ItemPedido;
import com.ramazzotte.cursomc.domain.Pagamento;
import com.ramazzotte.cursomc.domain.PagamentoComBoleto;
import com.ramazzotte.cursomc.domain.PagamentoComCartao;
import com.ramazzotte.cursomc.domain.Pedido;
import com.ramazzotte.cursomc.domain.Produto;
import com.ramazzotte.cursomc.domain.enuns.EstadoPagamento;
import com.ramazzotte.cursomc.domain.enuns.TipoCliente;
import com.ramazzotte.cursomc.repositories.CategoriaRepository;
import com.ramazzotte.cursomc.repositories.CidadeRepository;
import com.ramazzotte.cursomc.repositories.ClienteRepository;
import com.ramazzotte.cursomc.repositories.EnderecoRepository;
import com.ramazzotte.cursomc.repositories.EstadoRepository;
import com.ramazzotte.cursomc.repositories.ItemPedidoRepository;
import com.ramazzotte.cursomc.repositories.PagamentoRepository;
import com.ramazzotte.cursomc.repositories.PedidoRepository;
import com.ramazzotte.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

}
