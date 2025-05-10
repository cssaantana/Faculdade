#programa em python que simula uma calculadora com funções de soma, subtração, multiplicação e divisão, permitindo ao usuário realizar operações repetidas até encerrar o programa. o código trata entradas inválidas e verifica a divisão por zero.

def soma(x, y):
    return x + y

def subtração(x, y):
    return x - y

def multiplicação(x, y):
    return x * y

def divisão(x, y):
    if y != 0:
        return x / y
    else:
        return 'Erro: Não é possível dividir por 0.'

def calcular(numero1, numero2, operaçao):
    if operaçao == 'soma':
        return soma(numero1, numero2)
    elif operaçao == 'subtrair':
        return subtração(numero1, numero2)
    elif operaçao == 'multiplicar':
        return multiplicação(numero1, numero2)
    elif operaçao == 'dividir':
        return divisão(numero1, numero2)
    else:
        return 'Operação Inválida.'


def menu():
    print('Calculadora')
    print('Escolha a operação: ')
    print('1.  Soma')
    print('2. Subtração')
    print('3. Multiplicação')
    print('4. Divisão')

def executar_calculadora():
    while True:
        menu()
        escolha = input('Digite sua escolha (1, 2, 3, 4) ou "sair" para encerrar: ').lower()

        if escolha== 'sair':
            print('Programa encerrado.')
            break
        
        if escolha in ['1', '2', '3', '4']:
            try:
                numero1 = float(input('Digite o primeiro número: '))
                numero2 = float(input('Digite o segundo número: ')) 

                if escolha == '1':
                    resultado = calcular(numero1, numero2, 'soma')
                    print(f'resultado = {numero1} + {numero2} = {resultado}')
                elif escolha == '2':
                    resultado = calcular(numero1, numero2, 'subtrair')
                    print(f'resultado = {numero1} - {numero2} = {resultado}')
                elif escolha == '3':
                    resultado = calcular(numero1, numero2, 'multiplicar')
                    print(f'resultado = {numero1} * {numero2} = {resultado}')
                elif escolha == '4':
                    resultado = calcular(numero1, numero2, 'dividir')
                    if resultado == 'Erro: Não é possível dividir por 0.':
                        print(resultado)
                    else:    
                        print(f'resultado = {numero1} / {numero2} = {resultado}')
            except ValueError:
                print('Erro: Por favor, insira um número válido.')
        else:
            print('Opção inválida.')    
executar_calculadora()                