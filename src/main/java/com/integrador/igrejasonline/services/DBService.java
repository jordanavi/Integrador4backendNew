package com.integrador.igrejasonline.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.domain.Estado;
import com.integrador.igrejasonline.domain.Evento;
import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.repositories.CidadeRepository;
import com.integrador.igrejasonline.repositories.EnderecoRepository;
import com.integrador.igrejasonline.repositories.EstadoRepository;
import com.integrador.igrejasonline.repositories.EventoRepository;
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
	private EventoRepository eventoRepository;

	
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

		Igreja ent1 = new Igreja(null, "06164253000187", "3432565858", "Igreja Presbiteriana Central de Uberlândia",ende1);
		Igreja ent2 = new Igreja(null, "18233742000122", "3432565050", "Igreja Batista da Lagoinha", ende2);
		Igreja ent3 = new Igreja(null, "17790270000146", "9990853205", "Assembleia de Deus Uberlandia", ende1);
		Igreja ent4 = new Igreja(null, "29744778099622", "3432606050", "Igreja Universal Uberlandia", ende3);

		igrejaRepository.saveAll(Arrays.asList(ent1, ent2, ent3, ent4));

		Evento ev1 = new Evento(null, "Encontro de Jovens", "9112018", "19:30", "9112018", "21:30","Tema: juventude e sociedade", "Jovens", false, ende1);
		Evento ev2 = new Evento(null, "Dia do Homem Presbiteriano", "4022018", "18:00", "4022018", "20:00","Culto com comemoração", "Todos", false, ende2);
		Evento ev3 = new Evento(null, "Dia da Mulher Presbiteriana", "11022018", "18:00", "11022018", "20:00","Culto com comemoração", "Todos", false, ende3);
		Evento ev4 = new Evento(null, "Dia do Jovem Presbiteriano", "20052018", "18:00", "20052018", "20:00","Culto com comemoração", "Todos", false, ende3);
		Evento ev5 = new Evento(null, "Dia do Adolescente Presbiteriano", "13052018", "18:00", "13052018", "20:00","Culto com comemoração", "Todos", false, ende1);
		Evento ev6 = new Evento(null, "Semana Universal de Oração", "1012018", "18:00", "1712018", "20:00","Reunião de Oração", "Todos", false, ende2);
		Evento ev7 = new Evento(null, "Dia das Mães", "13052018", "18:00", "13052018", "20:00", "Culto com comemoração","Todos", false, ende1);
		Evento ev8 = new Evento(null, "Acampadentro IP Central", "18042018", "10:00", "22042018", "12:00","Retiro Espiritual", "Adolescentes", false, ende1);
		Evento ev9 = new Evento(null, "Acampamento Jovem", "18042018", "17:00", "22042018", "19:00", "Retiro Espiritual","Jovens", false, ende2);
		Evento ev10 = new Evento(null, "Culto", "21082018", "18:00", "21082018", "20:00", "Culto Dominical", "Todos",true, ende2);
		Evento ev11 = new Evento(null, "Reunião Semanal", "24082018", "19:30", "24082018", "21:30","Estudo Bíblico Semanal", "Todos", true, ende3);
		Evento ev12 = new Evento(null, "Escola Dominical", "21082018", "09:00", "21082018", "11:00","Escola Bíblica Dominical", "Todos", true, ende1);
		Evento ev13 = new Evento(null, "Reunião UPA", "19082018", "19:30", "19082018", "21:30","Reunião Semanal de Adolescentes", "Adolescentes", true, ende2);
		Evento ev14 = new Evento(null, "Reunião Mocidade", "20082018", "19:30", "20082018", "21:30","Reunião Semanal de Jovens", "Jovens", true, ende1);
		Evento ev15 = new Evento(null, "Grupo de Louvor Boanerges", "20082018", "17:00", "20082018", "19:00","Ensaio Semanal", "Grupo", true, ende3);
		Evento ev16 = new Evento(null, "Grupo de Estudo Valentes de Davi", "22082018", "20:00", "22082018", "22:00","Reunião Semanal", "Grupo", true, ende3);
		Evento ev17 = new Evento(null, "Clube de Oração Debora", "23082018", "07:00", "23082018", "09:00","Reunião de Oração Semanal", "Grupo", true, ende1);
		Evento ev18 = new Evento(null, "Coralito Cordeiros de Jesus", "21082018", "11:00", "21082018", "13:00","Ensaio Mensal", "Coral", true, ende2);
		Evento ev19 = new Evento(null, "Grupo de Mulheres Rute", "25082018", "20:00", "25082018", "22:00","Reunião Semanal", "Mulheres", true, ende3);
		Evento ev20 = new Evento(null, "Grupo de Comunhão Castelo Forte", "22082018", "19:30", "22082018", "21:30","Reunião Semanal", "Grupo", true, ende2);
		Evento ev21 = new Evento(null, "União das Crianças Presbiterianas", "19082018", "19:30", "19082018", "21:30","Reunião Semanal", "Crianças", true, ende3);
		Evento ev22 = new Evento(null, "União de Jovens Batistas", "20082018", "19:30", "20082018", "21:30","Reunião Semanal", "Jovens", true, ende1);
		Evento ev23 = new Evento(null, "União Batista de Adolescentes", "20082018", "17:00", "20082018", "19:00","Reunião Semanal", "Adolescentes", true, ende1);
		Evento ev24 = new Evento(null, "Grupo de Louvor El Shaday", "22082018", "20:00", "22082018", "22:00","Ensaio Semanal", "Grupo", true, ende3);
		Evento ev25 = new Evento(null, "Grupo de Oração Elohin", "23082018", "07:00", "23082018", "09:00","Reunião Semanal", "Grupo", true, ende2);
		Evento ev26 = new Evento(null, "Grupo de Estudo Manain", "21082018", "11:00", "21082018", "13:00","Reunião Semanal", "Grupo", true, ende1);
		Evento ev27 = new Evento(null, "Grupo de Estudos Maná", "25082018", "20:00", "25082018", "22:00","Reunião Semanal", "Grupo", true, ende3);
		Evento ev28 = new Evento(null, "União Presbiteriana de Homens", "22082018", "19:30", "22082018", "21:30","Reunião Mensal", "Homens", false, ende2);
		Evento ev29 = new Evento(null, "Grupo de Estudo Alfa e Ômega", "21082018", "20:00", "21082018", "22:00","Reunião Semanal", "Grupo", true, ende1);
		Evento ev30 = new Evento(null, "Coral Central", "25082018", "07:00", "25082018", "09:00", "Ensaio Semanal","Coral", true, ende3);

		eventoRepository.saveAll(Arrays.asList(ev1, ev2, ev3, ev4, ev5, ev6, ev7, ev8, ev9, ev10, ev11, ev12, ev13,
				ev14, ev15, ev16, ev17, ev18, ev19, ev20, ev21, ev22, ev23, ev24, ev25, ev26, ev27, ev28, ev29, ev30));
	}

}
