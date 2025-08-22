#programa em python que identifica se o número é positivo ou negativo.

def verificar_numero(numero):
    if numero > 0:
        return 'P'
    else:
        return 'N'
    
def main():
    numero = float(input('Digite um número:'))    
    resultado = verificar_numero(numero)
    print(f'O resultado é {resultado}')

main()