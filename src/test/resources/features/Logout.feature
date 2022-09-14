#language: pt
#encoding: UTF-8

@logoutAll

	Funcionalidade: usuario ira sair do sistema
	
	Contexto:
	Dado que o usuario esteja logado
	
	@realizarLogout
		Cenario: sair do sistema
	Quando o usuario clicar no perfil
	E clicar no botao logout
	Entao o sistema ira para tela inicial de login