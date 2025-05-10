#enunciado: "faça um programa que leia e valide as seguintes informações:
#1. nome: maior que 3 caracteres;
#2. idade: entre 0 e 150;
#3. salário: maior que zero;
#4. sexo: 'f' ou 'm';
#5. estado civil: 's', 'c', 'v', 'd';
#6. use a função len(string) para saber o tamanho de um texto (número de caracteres)."

def valida_nome():
    while True:
        nome = input('Digite seu nome: ')
        if len(nome) > 3:
            return nome
        else:
            print('Erro: Seu nome deve ter mais de três caracteres.')


def valida_idade():
    while  True:
        idade = int(input('Digite sua idade: '))
        if 0 <= idade <= 150:
            return idade
        else:
            print('Erro: Sua idade estar entre 0 a 150 anos.')

def valida_salario():
    while True:
        salario = float(input('Digite seu salário: '))
        if salario > 0:
            return salario
        else:
            print('Erro: Seu salário precisa ser acima de 0')


def valida_sexo():
    while True:
        sexo = input('Digite seu sexo:').lower()   
        if sexo in ['f', 'm']:
            return sexo
        else: 
            print('Erro: Seu sexo deve ser f: feminino ou m: masculino')     

def valida_ec():
    while True:
        ec = input('Informe seu Estado Civil: ').lower()
        if ec in ['s', 'c', 'v', 'd']:
            return ec
        else:
            print('Erro: seu estado civil deve ser s: solteiro, c: casado, v: viúvo ou d: divorciado.')

nome = valida_nome()
idade = valida_idade()
salario = valida_salario()
sexo = valida_sexo()
ec = valida_ec()

print(f'Nome: {nome}')
print(f'Idade: {idade}')
print(f'Salário: {salario}')
print(f'Sexo: {sexo}')
print(f'Estado Civil: {ec}')