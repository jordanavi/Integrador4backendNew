package com.integrador.igrejasonline.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integrador.igrejasonline.domain.Cidade;
import com.integrador.igrejasonline.domain.Endereco;
import com.integrador.igrejasonline.domain.Entidade;
import com.integrador.igrejasonline.domain.Estado;
import com.integrador.igrejasonline.domain.Evento;
import com.integrador.igrejasonline.domain.Igreja;
import com.integrador.igrejasonline.repositories.CidadeRepository;
import com.integrador.igrejasonline.repositories.EnderecoRepository;
import com.integrador.igrejasonline.repositories.EntidadeRepository;
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
	private EntidadeRepository entidadeRepository;
  @Autowired
	private EventoRepository eventoRepository;
	
	public void instantiateTestDatabase() throws ParseException {

		Estado estado1 = new Estado(null, "Acre","AC");
		Estado estado2 = new Estado(null, "Alagoas","AL");
		Estado estado3 = new Estado(null, "Amapá","AP");
		Estado estado4 = new Estado(null, "Amazonas","AM");
		Estado estado5 = new Estado(null, "Bahia","BA");
		Estado estado6 = new Estado(null, "Ceará","CE");
		Estado estado7 = new Estado(null, "Distrito Federal","DF");
		Estado estado8 = new Estado(null, "Espírito Santo","ES");
		Estado estado9 = new Estado(null, "Goiás","GO");
		Estado estado10 = new Estado(null, "Maranhão","MA");
		Estado estado11 = new Estado(null, "Mato Grosso","MT");
		Estado estado12 = new Estado(null, "Mato Grosso do Sul","MS");
		Estado estado13 = new Estado(null, "Minas Gerais","MG");
		Estado estado14 = new Estado(null, "Pará","PA");
		Estado estado15 = new Estado(null, "Paraíba","PB");
		Estado estado16 = new Estado(null, "Paraná","PR");
		Estado estado17 = new Estado(null, "Pernambuco","PE");
		Estado estado18 = new Estado(null, "Piauí","PI");
		Estado estado19 = new Estado(null, "Rio de Janeiro","RJ");
		Estado estado20 = new Estado(null, "Rio Grande do Norte","RN");
		Estado estado21 = new Estado(null, "Rio Grande do Sul","RS");
		Estado estado22 = new Estado(null, "Rondônia","RO");
		Estado estado23 = new Estado(null, "Roraima","RR");
		Estado estado24 = new Estado(null, "Santa Catarina","SC");
		Estado estado25 = new Estado(null, "São Paulo","SP");
		Estado estado26 = new Estado(null, "Sergipe","SE");
		Estado estado27 = new Estado(null, "Tocantins","TO");


		Cidade cidade1 = new Cidade(null, "Uberlândia", estado13);//2389
		Cidade cidade2 = new Cidade(null, "São Paulo", estado25);//5270
		Cidade cidade3 = new Cidade(null, "Campinas", estado25);//4814

		estado1.getCidades().addAll(Arrays.asList(cidade1));
		estado2.getCidades().addAll(Arrays.asList(cidade2, cidade3));
		estadoRepository.saveAll(Arrays.asList(estado1,  estado2,  estado3,  estado4,  estado5,  estado6,  estado7,  estado8,  estado9,  estado10,
											   estado11, estado12, estado13, estado14, estado15, estado16, estado17, estado18, estado19, estado20,
											   estado21, estado22, estado23, estado24, estado25, estado26, estado27));
		cidadeRepository.saveAll(Arrays.asList(cidade1, cidade2, cidade3));

		Endereco ende1 = new Endereco(null, "Rua do cavalo", "13", "Casa 1", "São Bento", "122334", cidade1);
		Endereco ende2 = new Endereco(null, "Rua do André", "34", "Casa", "São Bento mais 2", "76765", cidade2);
		Endereco ende3 = new Endereco(null, "Rua da Manga", "135", "Apt", "Santo Andre", "87655", cidade3);

		enderecoRepository.saveAll(Arrays.asList(ende1, ende2, ende3));
		
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
		
		Igreja ig1 = new Igreja(null, "06164253000187", "3432565858", "Igreja Presbiteriana Central de Uberlândia", ende1);
		Igreja ig2 = new Igreja(null, "18233742000122", "3432565050", "Igreja Batista da Lagoinha", ende2);
		Igreja ig3 = new Igreja(null, "17790270000146", "9990853205", "Igreja Presbiteriana Central de Uberlandia", ende1);
		Igreja ig4 = new Igreja(null, "29744778099622", "3432606050", "Igreja Universal Uberlandia", ende3);

		igrejaRepository.saveAll(Arrays.asList(ig1, ig2, ig3, ig4));
		
		
		Evento ev1 = new Evento(null, "Encontro de Jovens", "9112018", "19:30", "9112018", "21:30","Tema: juventude e sociedade", "Jovens", false, ende1,ig1);
		Evento ev2 = new Evento(null, "Dia do Homem Presbiteriano", "4022018", "18:00", "4022018", "20:00","Culto com comemoração", "Todos", false, ende2,ig2);
		Evento ev3 = new Evento(null, "Dia da Mulher Presbiteriana", "11022018", "18:00", "11022018", "20:00","Culto com comemoração", "Todos", false, ende3,ig1);
		Evento ev4 = new Evento(null, "Dia do Jovem Presbiteriano", "20052018", "18:00", "20052018", "20:00","Culto com comemoração", "Todos", false, ende3,ig4);
		Evento ev5 = new Evento(null, "Dia do Adolescente Presbiteriano", "13052018", "18:00", "13052018", "20:00","Culto com comemoração", "Todos", false, ende1,ig1);
/*
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
*/
		eventoRepository.saveAll(Arrays.asList(ev1, ev2, ev3, ev4, ev5));
		
	}

}
