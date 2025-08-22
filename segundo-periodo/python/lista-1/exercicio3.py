#enunciado: "faça um programa que verifique se uma letra digitada é vogal ou consoante."

letra = input('Digite uma letra: ')
if letra.lower() in "aeiou":
    print("Vogal")
else:
    print("Consoante")    