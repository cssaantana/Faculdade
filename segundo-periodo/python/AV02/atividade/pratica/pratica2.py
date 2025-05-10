#programa em python que conta a quantidade de dígitos de um número inteiro fornecido pelo usuário.

def contar_digitos(numero):
    return len(str(abs(numero)))

numero = int(input('Digite um número inteiro: '))
quantidade_digitos = contar_digitos(numero)
print(f'O número contém {quantidade_digitos} dígitos.')