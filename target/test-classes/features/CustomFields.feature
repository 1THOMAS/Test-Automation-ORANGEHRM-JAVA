#language: pt
#encoding: UTF-8

@customFieldsAll @2And2
	Funcionalidade: Validar o tipo sanguineo no perfil do usuario
	
	Contexto:
	Dado que o usuario esteja logado
	
	@ValidarCustomFields
		Cenario: Informar o tipo  sanguineo
	Quando o usuario clicar na aba my info
	E informar o tipo sanguineo
	E acionar o botao save
	Entao o usuario vai para pagina Custom Fields