package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Entidade;

@RestController
@RequestMapping(value="/entidades")
public class EntidadeResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Entidade> listar() {
		
		Entidade ent1 = new Entidade(1,"União da Mocidade Presbiteriana","999085674");
		Entidade ent2 = new Entidade(2,"União Presbiteriana de Adolescentes","999085675");
		Entidade ent3 = new Entidade(3,"Sociedade Auxiliadora Feminina","999085675");
		Entidade ent4 = new Entidade(4,"União Presbiteriana de Homens","999085676");
		Entidade ent5 = new Entidade(5,"Grupo de Estudo Alfa e Ômega","999085676");
		Entidade ent6 = new Entidade(6,"Coral Central","999085677");
		Entidade ent7 = new Entidade(7,"Coral de Jovens","999085677");
		Entidade ent8 = new Entidade(8,"União das Crianças Presbiterianas","999085678");
		Entidade ent9 = new Entidade(9,"União de Jovens Batistas","999085678");
		Entidade ent10 = new Entidade(10,"União Batista de Adolescentes","999085679");
		Entidade ent11 = new Entidade(11,"Grupo de Louvor El Shaday","999085679");
		Entidade ent12 = new Entidade(12,"Grupo de Oração Elohin","999085680");
		Entidade ent13 = new Entidade(13,"Grupo de Estudo Manain","999085680");
		Entidade ent14 = new Entidade(14,"Grupo de Estudos Maná","999085681");
		Entidade ent15 = new Entidade(15,"Clube de Oração Debora","999085681");
		Entidade ent16 = new Entidade(16,"Grupo de Estudo Valentes de Davi","999085682");
		Entidade ent17 = new Entidade(17,"Grupo de Louvor Boanerges","999085682");
		Entidade ent18 = new Entidade(18,"União Católica de Jovens","999085683");
		Entidade ent19 = new Entidade(19,"União Evangelica de Jovens","999085683");
		Entidade ent20 = new Entidade(20,"Grupo de Jovens Batistas","999085684");
		Entidade ent21 = new Entidade(21,"II Congregação Bairro Alvorada","999085684");
		Entidade ent22 = new Entidade(22,"Coralito Cordeiros de Jesus","999085685");
		Entidade ent23 = new Entidade(23,"Grupo de Mulheres Rute","999085685");
		Entidade ent24 = new Entidade(24,"Grupo de Comunhão Castelo Forte","999085686");
		Entidade ent25 = new Entidade(25,"Grupo de Comunhão Sarah","999085686");
		Entidade ent26 = new Entidade(26,"Grupo de Louvor Levitas","999085687");
		Entidade ent27 = new Entidade(27,"Grupo de Discipulado Presbiteriano","999085687");
		Entidade ent28 = new Entidade(28,"Centro de Estudos Bíblicos Batista","999085688");
		Entidade ent29 = new Entidade(29,"Creche Cordeiros do Senhor","999085688");
		Entidade ent30 = new Entidade(30,"Casa de Hospedagem Bethesda","999085689");
		
		List<Entidade> lista = new ArrayList<>();
		lista.add(ent1);
		lista.add(ent2);
		lista.add(ent3);
		lista.add(ent4);
		lista.add(ent5);
		lista.add(ent6);
		lista.add(ent7);
		lista.add(ent8);
		lista.add(ent9);
		lista.add(ent10);
		lista.add(ent11);
		lista.add(ent12);
		lista.add(ent13);
		lista.add(ent14);
		lista.add(ent15);
		lista.add(ent16);
		lista.add(ent17);
		lista.add(ent18);
		lista.add(ent19);
		lista.add(ent20);
		lista.add(ent21);
		lista.add(ent22);
		lista.add(ent23);
		lista.add(ent24);
		lista.add(ent25);
		lista.add(ent26);
		lista.add(ent27);
		lista.add(ent28);
		lista.add(ent29);
		lista.add(ent30);
		
		return lista;
	}
}
