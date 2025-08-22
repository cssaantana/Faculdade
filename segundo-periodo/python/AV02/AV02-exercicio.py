#calculadora simples que permite realizar as quatro operações (soma, subtração, multiplicação e divisão), além de uma interface de menu para escolher a operação.

def soma(x, y):
    return x + y

def subtração(x, y):
    return x - y

def multiplicação(x, y):
    return x * y

def divisão(x, y):
      return x / y

def menu():
    print('Calculadora')
    print('Escolha a operação: ')
    print('1.  Soma')
    print('2. Subtração')
    print('3. Multiplicação')
    print('4. Divisão')

def calculadora():
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
                    print(f'resultado = {numero1} + {numero2} = {soma (numero1, numero2)}')
                elif escolha == '2':
                    print(f'resultado = {numero1} - {numero2} = {subtração (numero1, numero2)}')
                elif escolha == '3':
                    print(f'resultado = {numero1} * {numero2} = {multiplicação (numero1, numero2)}')
                elif escolha == '4':
                    print(f'resultado = {numero1} / {numero2} = {divisão (numero1, numero2)}')
                    if numero2 == 0:
                        return 'Erro: Não é possível dividir por 0.'
            except ValueError:
                print('Erro: Por favor, insira um número válido.')
        else:
            print('Opção inválida.')    
calculadora()                