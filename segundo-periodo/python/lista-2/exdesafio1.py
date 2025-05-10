#enunciado: "a série de fibonacci é formada pela sequência 0,1,1,2,3,5,8,13,21,34,55,... faça um programa que gere a série até que o valor seja maior que 500."

a, b = 0, 1
print('Série da Fibonacci até que o valor seja maior que 500: ')
while a <= 500:
    print(a, end=' ')
    a, b = b, a + b