package com.integrador.igrejasonline.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.domain.Estado;
import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.repositories.CidadeRepository;
import com.integrador.igrejasonline.repositories.EnderecoRepository;
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
		
		Igreja ent1 = new Igreja(null, "06164253000187", "3432565858", "Igreja Presbiteriana Central de Uberlândia",
				ende1);
		Igreja ent2 = new Igreja(null, "18233742000122", "3432565050", "Igreja Batista da Lagoinha", ende2);
		Igreja ent3 = new Igreja(null, "17790270000146", "9990853205", "Assembleia de Deus Uberlandia", ende1);
		Igreja ent4 = new Igreja(null, "29744778099622", "3432606050", "Igreja Universal Uberlandia", ende3);

		igrejaRepository.saveAll(Arrays.asList(ent1, ent2, ent3, ent4));

	}

}
