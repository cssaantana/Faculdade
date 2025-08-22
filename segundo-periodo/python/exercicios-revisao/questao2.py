#Enunciado: "Desenvolva um algoritmo em Python que receba 3 notas e faça a média. O sistema deverá exibir:
#- Aprovado: se a média for maior ou igual a 7;
#- Reposição: se a média for menor que 7 mas maior ou igual a 4;
#- Reprovado: se a média for menor que 4. "

nota1 = float(input('Digite sua nota: '))
nota2 = float(input('Digite sua nota: '))
nota3 = float(input('Digite sua nota: '))
media = (nota1 + nota2 + nota3) / 3

if media >= 7:
    print('Aprovado!')
elif media < 7 and media >= 4:  
    print('Reposição.')
else:
    print('Reprovado.')