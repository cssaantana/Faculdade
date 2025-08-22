#sistema de login.

from controlador_usuario import autenticar

def main():
    login = input('Digite seu login: ')
    senha = input('Digite sua senha: ')

    if autenticar(login, senha):
        print('Seja bem vindo.')
    else:
        print('Login ou senha incorreta. Tente novamente.')
main()        