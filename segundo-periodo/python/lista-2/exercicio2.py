#enunciado: "faça um programa, utilizando while, que mostre na tela de 0 até n, em que n é o limite inserido pelo usuário."

numero = 0
limite = int(input("insira um número:"))
while numero <= limite:
    print(numero)
    numero += 1