#language: pt
#encoding: UTF-8

@cadastroAll @2And2
	Funcionalidade: Cadastro

	Contexto:
	Dado que o usuario esteja logado
	
@cadastroSucesso
	Cenario: Cadastrando usuario	
	Quando o usuario acionar o botao add
	E informar nome "Lucas"
	E informar sobrenome "Guerra"
	E acionar o botao save
	Entao o usuario vai para pagina de detalhes
	
@cadastroRequerimentoDeSobrenome
	Cenario: Requerimento de senha
	Quando o usuario acionar o botao add
	E informar nome "Lucas"
	E acionar o botao save
	Entao o sistema informa o requerimento
	
@cadastroRequerimentoDeNome
	Cenario: Requerinmento de login
	Quando o usuario acionar o botao add
	E informar sobrenome "Guerra"
	E acionar o botao save
	Entao o sistema informa o requerimento
	
@cadastroDetalhes
	Cenario: 	o cliente preenche os detalhes
	Quando o usuario acionar o botao add
	E informar nome "Lucas"
	E informar sobrenome "Guerra"
	E acionar o botao save
	E informar a nacionalidade
	E informar a data de nascimento "1992-03-26"
	E informar o genero
	E acionar o botao save