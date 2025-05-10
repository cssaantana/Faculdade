#Enunciado: "Escreva um programa em Python que solicite ao usuário um valor inteiro (denominado como 'n'). O programa deve exibir o dobro desse valor para todos os números de 1 até 'n', ou seja, para cada número no intervalo de 1 até 'n', você deverá calcular e mostrar o dobro desse número."

#Saída esperada:
#>> Digite um valor inteiro: 5
#Dobro dos números de 1 até 5:
#1: 2
#2: 4
#3: 6
#4: 8
#5: 10

n = int(input('Digite um valor inteiro: '))
print(f'Dobro dos números de 1 até {n}')

for i in range (1, n + 1):
    dobro = i * 2
    print(f'{i}: {dobro}')