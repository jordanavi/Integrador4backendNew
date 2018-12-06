package com.integrador.igrejasonline.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.domain.Entidade;
import com.integrador.igrejasonline.domain.Estado;
import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.repositories.CidadeRepository;
import com.integrador.igrejasonline.repositories.EnderecoRepository;
import com.integrador.igrejasonline.repositories.EntidadeRepository;
import com.integrador.igrejasonline.repositories.EstadoRepository;
import com.integrador.igrejasonline.repositories.IgrejaRepository;

@Service
public class DBService {
	@Autowired
	private IgrejaRepository igrejaRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private EntidadeRepository entidadeRepository;

	public void instantiateTestDatabase() throws ParseException {

		Estado estado1 = new Estado(null, "Minas Gerais");
		Estado estado2 = new Estado(null, "São Paulo");

		Cidade cidade1 = new Cidade(null, "Uberlândia", estado1);
		Cidade cidade2 = new Cidade(null, "São Paulo", estado2);
		Cidade cidade3 = new Cidade(null, "Campinas", estado2);

		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));
		estadoRepository.saveAll(Arrays.asList(estado1, estado2));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));

		Endereco ende1 = new Endereco(null, "Rua do cavalo", "13", "Casa 1", "São Bento", "122334", cidade1);
		Endereco ende2 = new Endereco(null, "Rua do André", "34", "Casa", "São Bento mais 2", "76765", cidade2);
		Endereco ende3 = new Endereco(null, "Rua da Manga", "135", "Apt", "Santo Andre", "87655", cidade3);

		enderecoRepository.saveAll(Arrays.asList(ende1, ende2, ende3));
		
		Igreja ig1 = new Igreja(null, "06164253000187", "3432565858", "Igreja Presbiteriana Central de Uberlândia",
				ende1);
		Igreja ig2 = new Igreja(null, "18233742000122", "3432565050", "Igreja Batista da Lagoinha", ende2);
		Igreja ig3 = new Igreja(null, "17790270000146", "9990853205", "Igreja Presbiteriana Central de Uberlandia", ende1);
		Igreja ig4 = new Igreja(null, "29744778099622", "3432606050", "Igreja Universal Uberlandia", ende3);

		igrejaRepository.saveAll(Arrays.asList(ig1, ig2, ig3, ig4));

		
		Entidade ent1 = new Entidade(1,"União da Mocidade Presbiteriana","999085674", ende2);
		Entidade ent2 = new Entidade(2,"União Presbiteriana de Adolescentes","999085675", ende1);
		Entidade ent3 = new Entidade(3,"Sociedade Auxiliadora Feminina","999085675", ende1);
		Entidade ent4 = new Entidade(4,"União Presbiteriana de Homens","999085676", ende2);
		Entidade ent5 = new Entidade(5,"Grupo de Estudo Alfa e Ômega","999085676", ende2);
		Entidade ent6 = new Entidade(6,"Coral Central","999085677", ende1);
		Entidade ent7 = new Entidade(7,"Coral de Jovens","999085677", ende2);
		Entidade ent8 = new Entidade(8,"União das Crianças Presbiterianas","999085678", ende1);
		Entidade ent9 = new Entidade(9,"União de Jovens Batistas","999085678", ende1);
		Entidade ent10 = new Entidade(10,"União Batista de Adolescentes","999085679", ende2);
		Entidade ent11 = new Entidade(11,"Grupo de Louvor El Shaday","999085679", ende3);
		Entidade ent12 = new Entidade(12,"Grupo de Oração Elohin","999085680", ende2);
		Entidade ent13 = new Entidade(13,"Grupo de Estudo Manain","999085680", ende3);
		Entidade ent14 = new Entidade(14,"Grupo de Estudos Maná","999085681", ende2);
		Entidade ent15 = new Entidade(15,"Clube de Oração Debora","999085681", ende2);
		Entidade ent16 = new Entidade(16,"Grupo de Estudo Valentes de Davi","999085682", ende2);
		Entidade ent17 = new Entidade(17,"Grupo de Louvor Boanerges","999085682", ende3);
		Entidade ent18 = new Entidade(18,"União Católica de Jovens","999085683", ende2);
		Entidade ent19 = new Entidade(19,"União Evangelica de Jovens","999085683", ende1);
		Entidade ent20 = new Entidade(20,"Grupo de Jovens Batistas","999085684", ende1);
		Entidade ent21 = new Entidade(21,"II Congregação Bairro Alvorada","999085684", ende2);
		Entidade ent22 = new Entidade(22,"Coralito Cordeiros de Jesus","999085685", ende1);
		Entidade ent23 = new Entidade(23,"Grupo de Mulheres Rute","999085685", ende2);
		Entidade ent24 = new Entidade(24,"Grupo de Comunhão Castelo Forte","999085686", ende1);
		Entidade ent25 = new Entidade(25,"Grupo de Comunhão Sarah","999085686", ende1);
		Entidade ent26 = new Entidade(26,"Grupo de Louvor Levitas","999085687", ende3);
		Entidade ent27 = new Entidade(27,"Grupo de Discipulado Presbiteriano","999085687", ende1);
		Entidade ent28 = new Entidade(28,"Centro de Estudos Bíblicos Batista","999085688", ende2);
		Entidade ent29 = new Entidade(29,"Creche Cordeiros do Senhor","999085688", ende2);
		Entidade ent30 = new Entidade(30,"Casa de Hospedagem Bethesda","999085689", ende1);

		entidadeRepository.saveAll(Arrays.asList(ent1,  ent2,  ent3,  ent4,  ent5,  ent6,  ent7,  ent8,  ent9,  ent10,
												 ent11, ent12, ent13, ent14, ent15, ent16, ent17, ent18, ent19, ent20,
												 ent21, ent22, ent23, ent24, ent25, ent26, ent27, ent28, ent29, ent30));
		
	}

}
