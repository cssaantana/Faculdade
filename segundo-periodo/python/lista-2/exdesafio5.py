#enunciado: "faça um programa que peça um número inteiro e determine se ele é ou não um número primo. um número primo é aquele que é divisível somente por ele mesmo e por 1."

num = int(input('Digite um número: '))
if num <= 1:
    print('Número não primo.')
else: 
    primo = True
    for i in range(2, int(num ** 0.5 + 1 )):
        if num % i == 0:
            primo = False
            break
    if primo:
        print('Número primo.') 
    else:
        print('Número não primo.')   