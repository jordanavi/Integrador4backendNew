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
		
		Responsavel resp1 = new Responsavel(1,"Jose da Silva","Jsilva","1234567","9987779744","Jsilva@gmail.com","999899898", null,null);
		Responsavel resp2 = new Responsavel(2,"Maria Antonieta","Mantonieta","1234567","9987779790","Mantonieta@hotmail.com","997769807", null,null);
		Responsavel resp3 = new Responsavel(3,"Gessé dos Santos","GSantos","1234567","9987779791","GSantos@outlook.com","997769807", null,null);
		Responsavel resp4 = new Responsavel(4,"Edinei dos Reis","EReis","1234567","9987779792","EReis@yahoo.com.br","997769808", null,null);
		Responsavel resp5 = new Responsavel(5,"Izabel Ferreira Da","IFerreira","1234567","9987779793","IFerreira@gmail.com","997769809", null,null);
		Responsavel resp6 = new Responsavel(6,"Wilma Santos Faria","WFaria","1234567","9987779794","WFaria@hotmail.com","997769810", null,null);
		Responsavel resp7 = new Responsavel(7,"Seantclear de Oliveira","SOliveira","1234567","9987779795","SOliveira@outlook.com","998569810", null,null);
		Responsavel resp8 = new Responsavel(8,"Matheus Machado Reis","mReis","1234567","9987779796","mReis@yahoo.com.br","998569812", null,null);
		Responsavel resp9 = new Responsavel(9,"Jeferson Batista Silva","BSilva","1234567","9987779797","BSilva@gmail.com","998569814", null,null);
		Responsavel resp10 = new Responsavel(10,"Gilberto Carvalho Junior","GJunior","1234567","9987779798","GJunior@hotmail.com","998569816", null,null);
		Responsavel resp11 = new Responsavel(11,"Elis da Silva","ESilva","1234567","9987779799","ESilva@outlook.com","998569818", null,null);
		Responsavel resp12 = new Responsavel(12,"Keleey Brito","KBrito","1234567","3487779800","KBrito@yahoo.com.br","998569820", null,null);
		Responsavel resp13 = new Responsavel(13,"Max Oliveira","mOliveira","1234567","3487779801","mOliveira@gmail.com","998569822", null,null);
		Responsavel resp14 = new Responsavel(14,"José Ferreira","JFerreira","1234567","3487779802","JFerreira@hotmail.com","998569824", null,null);
		Responsavel resp15 = new Responsavel(15,"Dayane de Souza","dSouza","1234567","3487779803","dSouza@outlook.com","998569826", null,null);
		Responsavel resp16 = new Responsavel(16,"Josiane de Sousa","JSousa","1234567","5087779804","JSousa@yahoo.com.br","998569828", null,null);
		Responsavel resp17 = new Responsavel(17,"Regina Fátima Batista","rBatista","1234567","5087779805","rBatista@gmail.com","998569830", null,null);
		Responsavel resp18 = new Responsavel(18,"Michelle de Sousa","MSousa","1234567","5097779806","MSousa@hotmail.com","998569832", null,null);
		Responsavel resp19 = new Responsavel(19,"Lidia Silva","LSilva","1234567","5099779807","LSilva@outlook.com","998569834", null,null);
		Responsavel resp20 = new Responsavel(20,"Mauro Rodrigues Lemos","MLemos","1234567","6787779808","MLemos@yahoo.com.br","988769810", null,null);
		Responsavel resp21 = new Responsavel(21,"Alex Alves Honorato","AHonorato","1234567","6799779809","AHonorato@gmail.com","988769805", null,null);
		Responsavel resp22 = new Responsavel(22,"Natalia Gonçalves","NGoncalves","1234567","6799877791","NGoncalves@hotmail.com","988769800", null,null);
		Responsavel resp23 = new Responsavel(23,"Lázaro de Souza","LSouza","1234567","6799877795","LSouza@outlook.com","988769795", null,null);
		Responsavel resp24 = new Responsavel(24,"Jordan Moura","JMoura","1234567","6799877798","JMoura@yahoo.com.br","988769790", null,null);
		Responsavel resp25 = new Responsavel(25,"Alexandre Afonso Campos","ACampos","1234567","6799877813","ACampos@gmail.com","988769785", null,null);
		Responsavel resp26 = new Responsavel(26,"Melissa Silva Rodrigues","MRodrigues","1234567","6799877814","MRodrigues@hotmail.com","988769780", null,null);
		Responsavel resp27 = new Responsavel(27,"Erika de Freitas","EFreitas","1234567","6799779815","EFreitas@outlook.com","988769775", null,null);
		Responsavel resp28 = new Responsavel(28,"Ivo Prudente","IPrudente","1234567","6799879816","IPrudente@yahoo.com.br","988769770", null,null);
		Responsavel resp29 = new Responsavel(29,"Rodrigo Oliveira","ROliveira","1234567","6799879817","ROliveira@gmail.com","988769765", null,null);
		Responsavel resp30 = new Responsavel(30,"Larissa Pádua Miranda","LMiranda","1234567","6749987818","LMiranda@hotmail.com","988769760", null,null);
		
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
