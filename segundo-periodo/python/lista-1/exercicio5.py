#enunciado: "faça um programa que leia três números e mostre o maior deles."

num1 = float(input('Primeiro numero:'))
num2 = float(input('Segundo numero: '))
num3 = float(input('Terceiro numero:'))

if num1 > num2 and num1 > num3:
    print(f"O maior número é o {num1}.")
elif num2 > num1 and num2 > num3:
    print(f"O maior número é o {num2}.")
elif num3 > num2 and num3 > num1:
    print(f"O maior número é o {num3}.")