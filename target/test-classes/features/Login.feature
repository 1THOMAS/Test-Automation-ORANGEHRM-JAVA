#language: pt
#encoding: UTF-8

@loginAll @2And2
	Funcionalidade: Login

@loginInvalido
	Cenario: Usuario invalido
	Quando eu informar o usuario "Admin"
	E informar a senha "321nimda"
	E clicar no botao login
	Entao o sistema exibe a mensagem de credenciais invalidas
	
@loginSenhaInvalida
	Cenario: Usuario invalido
	Quando eu informar o usuario "Admin"
	E informar a senha "321nimda"
	E clicar no botao login
	Entao o sistema exibe a mensagem de credenciais invalidas

@loginSucesso
	Cenario: Realizar Login
	Quando eu informar o usuario "Admin"
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe o usuario logado
	
@loginRequerimentoDeSenha
	Cenario: Usuario sem senha
	Quando eu informar o usuario "Admin"
	E informar a senha ""
	E clicar no botao login
	Entao o sistema exibe a mensagem requerir a senha
	
@loginRequerimentoDeLogin
	Cenario: Usuario sem login
	Quando eu informar o usuario ""
	E informar a senha "admin123"
	E clicar no botao login
	Entao o sistema exibe a mensagem requerir o usuario	