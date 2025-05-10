#enunciado: "faça um programa que peça dois números e imprima o maior deles."

num1 = float(input('Primeiro numero: '))
num2 = float(input('Segundo numero: '))

if num1 > num2: 
    print(f"o maior número é o {num1}.")
else:
    print(f'o maior número é o {num2}.')