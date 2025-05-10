#Enunciado: "Crie um programa em Python que leia um valor inteiro e exiba todos os números pares e ímpares no intervalo de 1 a esse valor, separando-os."

#Saída esperada:
#>> Digite um valor inteiro: 10 (input)
#>> Números pares até 10: 2, 4, 6, 8, 10 (output)
#>> Números ímpares até 10: 1, 3, 5, 7, 9 (output)

valor = (int(input('Digite um número: ')))

pares = []
impares = []

for i in range (1, valor + 1):
    if i % 2 ==0:
        pares.append(i)
    else:
        impares.append(i)
print(f'Pares: {pares}')
print(f'Impares: {impares}') 