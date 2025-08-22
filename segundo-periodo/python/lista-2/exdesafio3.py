#enunciado: "altere o programa anterior (ex. desafio 2.) para que ele aceite apenas números entre 0 e 1000."

n = int(input('Quantos números deseja inserir?: '))
numeros = []

for i in range(n):
    while True:
        numero = int(input(f'Digite o número {i + 1}: '))
        if numero <= 1000:
            numeros.append(numero)
            break
        else:
            print('Número fora do intervalo permitido. Tente novamente.')

maior_valor = max(numeros)
menor_valor = min(numeros)
soma_valor = sum(numeros)

print(f'Maior valor: {maior_valor}')
print(f'Menor valor: {menor_valor}')
print(f'Soma dos Valores: {soma_valor}')