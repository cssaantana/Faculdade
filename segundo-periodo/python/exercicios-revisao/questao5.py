#Enunciado: "Crie uma lista contendo dicionários de produtos de forma a representar:

#"{
#‘nome’: ‘Nome do Produto 1’
#‘preco’: ‘Preço do Produto 1’
#},
#{
#‘nome’: ‘Nome do Produto 2’
#‘preco’: ‘Preço do Produto 2’
#}"

#E mostre ao usuário todos os produtos dessa lista:

#"Produto 1 - 50 RS
#Produto 2 - 60 R$
#Produto N - xx R$""

produtos = [
    {
        'livro': 'Livro de ficção',
        'preço': '45.00'
    },
    {
        'livro': 'Livro de ficção científica',
        'preço': '50.00'
    },
    {
        'livro': 'Livro de receitas',
        'preço': '40.00'
    }
]

for produto in produtos:
    nome = produto['livro']
    preço = produto ['preço']
    print(f'{nome} - R$ {preço}')