#enunciado: "faça um programa para a leitura de duas notas parciais de um aluno. o programa deve calcular a média alcançada por aluno e apresentar:
#- a mensagem "aprovado", se a média alcançada for maior ou igual a sete;
#- a mensagem "reprovado", se a média for menor do que sete;
#- a mensagem "aprovado com distinção", se a média for igual a dez."

nota1 = float(input('Primeira nota: '))
nota2 = float(input('Segunda nota: '))
media = (nota1 + nota2) / 2

if media == 10:
    print('Aprovado com distinção!')
elif media >= 7: 
    print('Aprovado.')  
else:
    print('Reprovado.')