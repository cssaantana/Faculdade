#enunciado: "faça um programa que, dado um conjunto de n números, determine o menor valor, o maior valor e a soma dos valores."

n = int(input('Quantos números deseja inserir?: '))
numeros = []

for i in range(n):
    numero = int(input(f'Digite o número {i + 1}: '))
    numeros.append(numero)

maior_valor = max(numeros)
menor_valor = min(numeros)
soma_valor = sum(numeros)

print(f'Maior valor: {maior_valor}')
print(f'Menor valor: {menor_valor}')
print(f'Soma dos Valores: {soma_valor}')