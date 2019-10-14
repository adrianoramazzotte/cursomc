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
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtorepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private PedidoRepository pedidoRepository;
	@Autowired
	private PagamentoRepository pagamentoRepository;
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		Categoria cat3 = new Categoria(null, "Cama");
		Categoria cat4 = new Categoria(null, "Mesa e Banho");
		Categoria cat5 = new Categoria(null, "Prudutos naturais");
		Categoria cat6 = new Categoria(null, "Jardinagem");
		Categoria cat7 = new Categoria(null, "Ferramenta");
		Categoria cat8 = new Categoria(null, "Naturais");
		Categoria cat9 = new Categoria(null, "Eletrônico");
		
		
		Produto p1 = new Produto(null, "Computadors", 2000.00);
		Produto p2 = new Produto(null, "Impressoras", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Erva1s", 2000.00);
		Produto p5 = new Produto(null, "Erva2s", 800.00);
		Produto p6= new Produto(null, "TVs", 80.00);
		Produto p7 = new Produto(null, "Plavas de Vídeo", 2000.00);
		Produto p8 = new Produto(null, "Lençol", 800.00);
		Produto p9 = new Produto(null, "Toalha", 80.00);
		Produto p10 = new Produto(null, "Traveseiro", 2000.00);
		Produto p11 = new Produto(null, "Flors", 800.00);
		Produto p12= new Produto(null, "mudas", 80.00);
		Produto p13= new Produto(null, "alicate", 80.00);

		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		cat3.getProdutos().addAll(Arrays.asList(p8,p9,p10));
		cat4.getProdutos().addAll(Arrays.asList(p8,p9,p10));
		cat5.getProdutos().addAll(Arrays.asList(p5,p6,p11));
		cat6.getProdutos().addAll(Arrays.asList(p12,p11));
		cat7.getProdutos().addAll(Arrays.asList(p13));
		cat8.getProdutos().addAll(Arrays.asList(p4,p5));
		cat9.getProdutos().addAll(Arrays.asList(p1,p2,p3,p6,p7));
		
		p1.getCategorias().addAll(Arrays.asList(cat1,cat9));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2,cat9));
		p3.getCategorias().addAll(Arrays.asList(cat1,cat9));	
		p4.getCategorias().addAll(Arrays.asList(cat8));
		p5.getCategorias().addAll(Arrays.asList(cat5, cat8));
		p6.getCategorias().addAll(Arrays.asList(cat5,cat9));		
		p7.getCategorias().addAll(Arrays.asList(cat9));
		p8.getCategorias().addAll(Arrays.asList(cat3, cat4));
		p9.getCategorias().addAll(Arrays.asList(cat3,cat4));		
		p10.getCategorias().addAll(Arrays.asList(cat3,cat4));		
		p11.getCategorias().addAll(Arrays.asList(cat5, cat6));
		p12.getCategorias().addAll(Arrays.asList(cat6));
		p13.getCategorias().addAll(Arrays.asList(cat7));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2,cat9,cat3,cat4,cat5,cat6,cat7,cat8,cat9));
		produtorepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377",TipoCliente.PESSOAFISICA); 
		cli1.getTelefones().addAll(Arrays.asList("27362322","93838393"));
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim","38220834", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua Avenida Matos", "105", "sala 800", "Centro","38220988", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Pedido ped1 = new Pedido(null, sdf.parse("10/10/2019 10:32"),e1, cli1 );
		Pedido ped2 = new Pedido(null, sdf.parse("20/10/2019 10:32"),e2, cli1 );
		
		Pagamento pagto1 = new PagamentoComCartao(null,EstadoPagamento.QUITADO,6,ped1);
		ped1.setPagamento(pagto1);
		Pagamento pagto2 = new PagamentoComBoleto(null,EstadoPagamento.PENDENTE,sdf.parse("20/10/2020 00:00"),null,ped2);
		ped2.setPagamento(pagto2);	
		
		cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1,pagto2));
				
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1,ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip3));
		p3.getItens().addAll(Arrays.asList(ip2));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1,ip2,ip3));
		
		
	}

}
