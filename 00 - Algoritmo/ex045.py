import tkinter as tk
from random import choice
import time

elementos = ['PEDRA', 'PAPEL', 'TESOURA']
escolha = choice(elementos)

janela = tk.Tk()
janela.configure(bg='#E0FFFF')
def escolher_elemento1():
    escolha_computador1 = '\nVocê escolheu: PEDRA\n\nComputador escolheu: {}'.format(escolha)
    label_computador1['text'] = escolha_computador1

    if escolha == ' TESOURA' and escolha != 'PEDRA' and escolha != 'PAPEL':
        mensagem1 = ' \nParabéns! Você venceu!'.format(time.sleep(1))
        label_mensagem1['text'] = mensagem1
    if escolha == ' PEDRA' and escolha != 'PAPEL' and escolha != 'TESOURA':
        mensagem2 = ' \nEmpatamos!'.format(time.sleep(1))
        label_mensagem2['text'] = mensagem2
    if escolha == 'PAPEL' and escolha != 'PEDRA' and escolha != 'TESOURA':
        mensagem3 = ' \nComputador venceu!'.format(time.sleep(1))
        label_mensagem3['text'] = mensagem3


def escolher_elemento2():
    escolha_computador2 = '\nVocê escolheu: PAPEL\n\nE o computador escolheu: {}'.format(escolha)
    label_computador2['text'] = escolha_computador2
    if escolha == 'PEDRA' and escolha != 'PAPEL' and escolha != 'TESOURA':
        mensagem4 = ' \nParabéns! Você venceu!'.format(time.sleep(1))
        label_mensagem4['text'] = mensagem4
    if escolha == 'PAPEL' and escolha != 'PEDRA' and escolha != 'TESOURA':
        mensagem5 = ' \nEmpatamos!'.format(time.sleep(1))
        label_mensagem5['text'] = mensagem5
    if escolha == 'TESOURA' and escolha != 'PEDRA' and escolha != 'PAPEL':
        mensagem6 = ' \nComputador venceu!'.format(time.sleep(1))
        label_mensagem6['text'] = mensagem6

def escolher_elemento3():
    escolha_computador3 = '\nVocê escolheu: TESOURA\n\nO computador escolheu: {}'.format(escolha)
    label_computador3['text'] = escolha_computador3

    if escolha == 'PAPEL' and escolha != 'TESOURA' and escolha != 'PEDRA':
        mensagem7 = ' \nParabéns! Você venceu!'.format(time.sleep(1))
        label_mensagem7['text'] = mensagem7
    if escolha == 'TESOURA' and escolha != 'PAPEL' and escolha != 'PEDRA':
        mensagem8 = ' \nEmpatamos!'.format(time.sleep(1))
        label_mensagem8['text'] = mensagem8
    if escolha == 'PEDRA' and escolha != 'PAPEL' and escolha != 'TESOURA':
        mensagem9 = ' \nComputador venceu!'.format(time.sleep(1))
        label_mensagem9['text']= mensagem9



def fechar_janela():
    janela.destroy()

# Criar quadro
'''quadro = tk.Frame(janela, width=599, height=360, bg='#B0E0E6')
quadro.place(x=1, y=240)'''

# Criar um rótulo
rotulo = tk.Label(janela, text="|"*600, fg='blue', bg='#E0FFFF', font=25)
rotulo.place(y=0)
rotulo = tk.Label(janela, text="Escolha uma das opções abaixo:\n".upper(), fg='blue', bg='#E0FFFF', font=25)
rotulo.place(x=140, y=90)

rotulo = tk.Label(janela, text="|"*600, fg='blue', bg='#E0FFFF', font=25)
rotulo.place(y=174)




# Criar um botão

botao = tk.Button(janela, text='Pedra', command=escolher_elemento1, width=10, height=2, bg='#E0FFFF')
botao.pack()
botao.place(x=1, y=200)
label_computador1 = tk.Label(janela, text='', font=15, fg='red', bg='#E0FFFF')
label_computador1.place(x=150, y=280)
label_mensagem1 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem1.place(x=200, y=400)
label_mensagem2 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem2.place(x=200, y=400)
label_mensagem3 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem3.place(x=200, y=400)

botao = tk.Button(janela, text="Papel", command=escolher_elemento2, width=10, height=2, bg='#E0FFFF')
botao.pack()
botao.place(x=260, y=200)
label_computador2 = tk.Label(janela, text='', font=15, fg='red', bg='#E0FFFF')
label_computador2.place(x=150, y=280)
label_mensagem4= tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem4.place(x=200, y=400)
label_mensagem5 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem5.place(x=200, y=400)
label_mensagem6 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem6.place(x=200, y=400)

botao = tk.Button(janela, text="Tesoura", command=escolher_elemento3, width=10, height=2, bg='#E0FFFF')
botao.pack()
botao.place(x=520, y=200)
label_computador3 = tk.Label(janela, text='', font=15, fg='red', bg='#E0FFFF')
label_computador3.place(x=150, y=280)
label_mensagem7 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem7.place(x=200, y=400)
label_mensagem8= tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem8.place(x=200, y=400)
label_mensagem9 = tk.Label(janela, text='', font=15, bg='#E0FFFF', fg='#00BFFF')
label_mensagem9.place(x=200, y=400)

# Criar uma caixa de texto
'''caixa_texto = tk.Entry(janela)
caixa_texto.pack()'''

# Define a largura como 800 pixels e a altura como 600 pixels
janela.geometry("600x600")



# Escolha do computador
janela.after(8000, fechar_janela)

janela.mainloop()
