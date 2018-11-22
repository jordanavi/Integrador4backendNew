package com.integrador.igrejasonline.resourcers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.integrador.igrejasonline.domain.Responsavel;

@RestController
@RequestMapping(value="/responsaveis")
public class ResponsavelResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Responsavel> listar() {
		
		Responsavel resp1 = new Responsavel(1,"09987779744","Jose da Silva","999899898", null);
		Responsavel resp2 = new Responsavel(2,"09987779790","Maria Antonieta","997769807", null);
		Responsavel resp3 = new Responsavel(3,"09987779791","Gessé dos Santos","997769807", null);
		Responsavel resp4 = new Responsavel(4,"09987779792","Edinei dos Reis","997769808", null);
		Responsavel resp5 = new Responsavel(5,"09987779793","Izabel Ferreira Da","997769809", null);
		Responsavel resp6 = new Responsavel(6,"09987779794","Wilma Santos Faria","997769810", null);
		Responsavel resp7 = new Responsavel(7,"09987779795","Seantclear de Oliveira","998569810", null);
		Responsavel resp8 = new Responsavel(8,"09987779796","Matheus Machado Reis","998569812", null);
		Responsavel resp9 = new Responsavel(9,"09987779797","Jeferson Batista Silva","998569814", null);
		Responsavel resp10 = new Responsavel(10,"09987779798","Gilberto Carvalho Junior","998569816", null);
		Responsavel resp11 = new Responsavel(11,"09987779799","Elis da Silva","998569818", null);
		Responsavel resp12 = new Responsavel(12,"03487779800","Keleey Brito","998569820", null);
		Responsavel resp13 = new Responsavel(13,"03487779801","Max Oliveira","998569822", null);
		Responsavel resp14 = new Responsavel(14,"03487779802","José Ferreira","998569824", null);
		Responsavel resp15 = new Responsavel(15,"03487779803","Dayane de Souza","998569826", null);
		Responsavel resp16 = new Responsavel(16,"05087779804","Josiane de Sousa","998569828", null);
		Responsavel resp17 = new Responsavel(17,"05087779805","Regina Fátima Batista","998569830", null);
		Responsavel resp18 = new Responsavel(18,"05097779806","Michelle de Sousa","998569832", null);
		Responsavel resp19 = new Responsavel(19,"05099779807","Lidia Silva","998569834", null);
		Responsavel resp20 = new Responsavel(20,"06787779808","Mauro Rodrigues Lemos","988769810", null);
		Responsavel resp21 = new Responsavel(21,"06799779809","Alex Alves Honorato","988769805", null);
		Responsavel resp22 = new Responsavel(22,"06799877791","Natalia Gonçalves","988769800", null);
		Responsavel resp23 = new Responsavel(23,"06799877795","Lázaro de Souza","988769795", null);
		Responsavel resp24 = new Responsavel(24,"06799877798","Jordan Moura","988769790", null);
		Responsavel resp25 = new Responsavel(25,"06799877813","Alexandre Afonso Campos","988769785", null);
		Responsavel resp26 = new Responsavel(26,"06799877814","Melissa Silva Rodrigues","988769780", null);
		Responsavel resp27 = new Responsavel(27,"06799779815","Erika de Freitas","988769775", null);
		Responsavel resp28 = new Responsavel(28,"06799879816","Ivo Prudente","988769770", null);
		Responsavel resp29 = new Responsavel(29,"06799879817","Rodrigo Oliveira","988769765", null);
		Responsavel resp30 = new Responsavel(30,"06749987818","Larissa Pádua Miranda","988769760", null);
		
		List<Responsavel> lista = new ArrayList<>();
		lista.add(resp1);
		lista.add(resp2);
		lista.add(resp3);
		lista.add(resp4);
		lista.add(resp5);
		lista.add(resp6);
		lista.add(resp7);
		lista.add(resp8);
		lista.add(resp9);
		lista.add(resp10);
		lista.add(resp11);
		lista.add(resp12);
		lista.add(resp13);
		lista.add(resp14);
		lista.add(resp15);
		lista.add(resp16);
		lista.add(resp17);
		lista.add(resp18);
		lista.add(resp19);
		lista.add(resp20);
		lista.add(resp21);
		lista.add(resp22);
		lista.add(resp23);
		lista.add(resp24);
		lista.add(resp25);
		lista.add(resp26);
		lista.add(resp27);
		lista.add(resp28);
		lista.add(resp29);
		lista.add(resp30);
		
		return lista;
	}
}
