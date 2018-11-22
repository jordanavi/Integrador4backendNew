package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Evento;

@RestController
@RequestMapping(value="/eventos")
public class EventoResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Evento> listar() {
		
		Evento ev1 = new Evento (1,"Encontro de Jovens","9112018","19:30","9112018","21:30","Tema: juventude e sociedade","Jovens",false, null);
		Evento ev2 = new Evento (2,"Dia do Homem Presbiteriano","4022018","18:00","4022018","20:00","Culto com comemoração","Todos",false, null);
		Evento ev3 = new Evento (3,"Dia da Mulher Presbiteriana","11022018","18:00","11022018","20:00","Culto com comemoração","Todos",false, null);
		Evento ev4 = new Evento (4,"Dia do Jovem Presbiteriano","20052018","18:00","20052018","20:00","Culto com comemoração","Todos",false, null);
		Evento ev5 = new Evento (5,"Dia do Adolescente Presbiteriano","13052018","18:00","13052018","20:00","Culto com comemoração","Todos",false, null);
		Evento ev6 = new Evento (6,"Semana Universal de Oração","1012018","18:00","1712018","20:00","Reunião de Oração","Todos",false, null);
		Evento ev7 = new Evento (7,"Dia das Mães","13052018","18:00","13052018","20:00","Culto com comemoração","Todos",false, null);
		Evento ev8 = new Evento (8,"Acampadentro IP Central","18042018","10:00","22042018","12:00","Retiro Espiritual","Adolescentes",false, null);
		Evento ev9 = new Evento (9,"Acampamento Jovem","18042018","17:00","22042018","19:00","Retiro Espiritual","Jovens",false, null);
		Evento ev10 = new Evento (10,"Culto","21082018","18:00","21082018","20:00","Culto Dominical","Todos",true, null);
		Evento ev11 = new Evento (11,"Reunião Semanal","24082018","19:30","24082018","21:30","Estudo Bíblico Semanal","Todos",true, null);
		Evento ev12 = new Evento (12,"Escola Dominical","21082018","09:00","21082018","11:00","Escola Bíblica Dominical","Todos",true, null);
		Evento ev13 = new Evento (13,"Reunião UPA","19082018","19:30","19082018","21:30","Reunião Semanal de Adolescentes","Adolescentes",true, null);
		Evento ev14 = new Evento (14,"Reunião Mocidade","20082018","19:30","20082018","21:30","Reunião Semanal de Jovens","Jovens",true, null);
		Evento ev15 = new Evento (15,"Grupo de Louvor Boanerges","20082018","17:00","20082018","19:00","Ensaio Semanal","Grupo",true, null);
		Evento ev16 = new Evento (16,"Grupo de Estudo Valentes de Davi","22082018","20:00","22082018","22:00","Reunião Semanal","Grupo",true, null);
		Evento ev17 = new Evento (17,"Clube de Oração Debora","23082018","07:00","23082018","09:00","Reunião de Oração Semanal","Grupo",true, null);
		Evento ev18 = new Evento (18,"Coralito Cordeiros de Jesus","21082018","11:00","21082018","13:00","Ensaio Mensal","Coral",true, null);
		Evento ev19 = new Evento (19,"Grupo de Mulheres Rute","25082018","20:00","25082018","22:00","Reunião Semanal","Mulheres",true, null);
		Evento ev20 = new Evento (20,"Grupo de Comunhão Castelo Forte","22082018","19:30","22082018","21:30","Reunião Semanal","Grupo",true, null);
		Evento ev21 = new Evento (21,"União das Crianças Presbiterianas","19082018","19:30","19082018","21:30","Reunião Semanal","Crianças",true, null);
		Evento ev22 = new Evento (22,"União de Jovens Batistas","20082018","19:30","20082018","21:30","Reunião Semanal","Jovens",true, null);
		Evento ev23 = new Evento (23,"União Batista de Adolescentes","20082018","17:00","20082018","19:00","Reunião Semanal","Adolescentes",true, null);
		Evento ev24 = new Evento (24,"Grupo de Louvor El Shaday","22082018","20:00","22082018","22:00","Ensaio Semanal","Grupo",true, null);
		Evento ev25 = new Evento (25,"Grupo de Oração Elohin","23082018","07:00","23082018","09:00","Reunião Semanal","Grupo",true, null);
		Evento ev26 = new Evento (26,"Grupo de Estudo Manain","21082018","11:00","21082018","13:00","Reunião Semanal","Grupo",true, null);
		Evento ev27 = new Evento (27,"Grupo de Estudos Maná","25082018","20:00","25082018","22:00","Reunião Semanal","Grupo",true, null);
		Evento ev28 = new Evento (28,"União Presbiteriana de Homens","22082018","19:30","22082018","21:30","Reunião Mensal","Homens",false, null);
		Evento ev29 = new Evento (29,"Grupo de Estudo Alfa e Ômega","21082018","20:00","21082018","22:00","Reunião Semanal","Grupo",true, null);
		Evento ev30 = new Evento (30,"Coral Central","25082018","07:00","25082018","09:00","Ensaio Semanal","Coral",true, null);
		
		List<Evento> lista = new ArrayList<>();
		lista.add(ev1);
		lista.add(ev2);
		lista.add(ev3);
		lista.add(ev4);
		lista.add(ev5);
		lista.add(ev6);
		lista.add(ev7);
		lista.add(ev8);
		lista.add(ev9);
		lista.add(ev10);
		lista.add(ev11);
		lista.add(ev12);
		lista.add(ev13);
		lista.add(ev14);
		lista.add(ev15);
		lista.add(ev16);
		lista.add(ev17);
		lista.add(ev18);
		lista.add(ev19);
		lista.add(ev20);
		lista.add(ev21);
		lista.add(ev22);
		lista.add(ev23);
		lista.add(ev24);
		lista.add(ev25);
		lista.add(ev26);
		lista.add(ev27);
		lista.add(ev28);
		lista.add(ev29);
		lista.add(ev30);
		
		return lista;
	}
}
