#Enunciado: "Você foi designado para desenvolver um programa que converta temperaturas entre diferentes escalas. Suas tarefas são as seguintes:

#- Escreva um programa em Python que exiba um menu com as seguintes opções:
#1. Converter de Celsius para Fahrenheit
#2. Converter de Fahrenheit para Celsius

#- Caso usuário selecionar 1 (converter Celsius para Fahrenheit) Realize a conversão da temperatura de Celsius para Fahrenheit utilizando a fórmula: Fahrenheit = (Celsius * 9/5) + 32. Exiba o resultado da conversão.
#- Caso usuário selecionar 2 (converter Fahrenheit para Celsius)
#Realize a conversão da temperatura de Fahrenheit para Celsius utilizando a fórmula: Celsius = (Fahrenheit - 32) * 5/9. Exiba o resultado da conversão."

print('Bem vindo ao Conversor de Temperaturas!')

while True: 
    opção = int(input('Escolha uma opção: \n 1. Converter de Celsius para Fahreinheit\n 2. Converter de Fahrenheit para Celsius\n'))
    if opção == 1:
        print('>> Opção: 1')
        celsius = float(input('>> Digite a temperatura em Celsius: '))
        fahreinheit = (celsius * 9/5) + 32
        print(f'{celsius} graus Celsius é igual a {fahreinheit} graus Fahreinheit.')
    elif opção == 2:
        print('>> Opção: 2')
        fahreinheit = float(input('>> Digite a temperatura em Fahreinheit: '))    
        celsius = (fahreinheit - 32) * 5/9
        print(f'{fahreinheit} graus Fahreinheit é igual a {celsius} graus Celsius.')
        break
    else:
        print('Opção inválida.')