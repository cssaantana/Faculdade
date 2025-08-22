#enunciado: "faça um programa que faça 5 perguntas para uma pessoa sobre um crime. as perguntas são:
#- "telefonou para a vítima?"
#- "esteve no local do crime?"
#- "mora perto da vítima?"
#- "devia para a vítima?"
#- "já trabalhou com a vítima?"
#o programa deve no final emitir uma classificação sobre a participação da pessoa no crime. se a pessoa responder positivamente a 2 questões ela deve ser classificada como "suspeita", entre 3 e 4 como "cúmplice" e 5 como "assassino". caso contrário, ele será classificado como "inocente"."

pontos = 0
telefone = input('A. Telefonou para a vítima?: ')
if telefone.lower() == 'sim': 
    pontos += 1 
local = input('B. Esteve perto do local do crime?: ')
if local.lower() == 'sim':
    pontos += 1
morar = input('C. Mora perto da vítima?: ')
if morar.lower() == 'sim':
    pontos += 1
dever = input('D. Devia para vítima?: ')
if dever.lower() == 'sim':
    pontos += 1
trabalho = input('E. Já trabalhou com a vítima?: ')
if trabalho.lower() == 'sim':
    pontos += 1

if pontos == 2:
    print('Suspeito')
elif pontos == 3 or pontos == 4:
    print('Cumplice')
elif pontos > 4: 
    print('Assassino')
else:
    print('Inocente')