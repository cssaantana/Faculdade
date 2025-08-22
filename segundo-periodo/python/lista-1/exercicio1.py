#enunciado: "faça um programa que peça um número inteiro e determine se ele é par ou ímpar."

numero = int(input("Digite um número inteiro: "))
if numero % 2 == 0:
    print("Par")
else:
    print('Impar')