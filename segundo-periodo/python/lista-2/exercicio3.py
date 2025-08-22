#enunciado: "faça um programa, utilizando while, que permita o usuário fazer contas de adição enquanto quiser."

print('Operação - Adição!')

continuar = 's'
while continuar.lower() == 's':
    num1 = int(input('Digite um número: '))
    num2 = int(input('Digite outro número: '))
    resultado = num1 + num2
    print(f'{num1} + {num2} = {resultado}')
    continuar = input('Deseja realizar mais uma soma? [S ou N]: ')
print('Programa Encerrado.')