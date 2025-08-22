#enunciado: "faça um programa que pergunte em que turno você estuda. peça para digitar M - matutino ou V - vespertino ou N - noturno. imprima a mensagem "bom dia!", "boa tarde!" ou "boa noite!" ou "valor inválido!", conforme o caso."

turno = input('Digite seu turno (M - Matutino, V - Vespetino ou N - Noturno): ')

if turno.lower() == 'm':
    print('Bom dia!')
elif turno.lower() == 'v':
    print('Boa tarde!')
elif turno.lower() == 'n':
    print('Boa noite!')
else:
    print('Valor invalido.')