import time

import helium
from helium import *

start_chrome("https://cliente.hostgator.com.br/")

click('Aceitar todos os cookies')
write('contaas-online@hotmail.com', into='Insira aqui seu e-mail')
write('@bE7GaTe3SuxMsS', into='Senha')
click('Não sou um robô')
time.sleep(5)
click('Entrar')

time.sleep(10)

