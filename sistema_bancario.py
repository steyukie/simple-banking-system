menu = """

[1] Depositar
[2] Sacar
[3] Extrato
[4] Sair

Selecione a sua opção:
"""


saldo = 0
limite = 500
extrato = ""
numero_saques = 0
LIMITE_SAQUES = 3


while True:

    opcao = input(menu)

#  DEPÓSITO
    if opcao == "1":
        
        valor = float(input("Qual o valor a ser depositado? R$"))

        if valor > 0:

            saldo += valor
            extrato += f"Depósito: R${valor:.2f}\n"
            
            print(f"R${valor} depositado com sucesso.")

        else:
            print("Valor inválido. Tente novamente")
    
#  SAQUE
    elif opcao == "2":
        valor = float(input("Qual o valor a ser sacado? R$"))

        saldo_insuficiente = valor > saldo

        excedeu_saque = numero_saques >= LIMITE_SAQUES

        excedeu_limite = valor > limite


        if saldo_insuficiente:
            print("Saldo insuficiente. Tente novamente")

        elif excedeu_limite:
            print("Limite insuficiente. Tente novamente")

        elif excedeu_saque:
            print("Limite diário de saque atingido. Volte amanhã.")
        
        elif valor > 0:
            numero_saques += 1

            saldo -= valor

            extrato += f"Saque: R${valor:.2f}\n"

            print("Retire seu dinheiro.")
            print(f"R${valor} sacado com sucesso.")
                
        else:
            print("Valor inválido. Digite um valor válido.")

#  EXTRATO
    elif opcao == "3":
        print(f"------------- EXTRATO -------------")                    
        print(f"{extrato}")                            
        print(f"SALDO R$ {saldo:.2f}")
              

#  QUIT
    elif opcao == "4":
        break

    else:
        print("Opção inválida. Tente novamente.")