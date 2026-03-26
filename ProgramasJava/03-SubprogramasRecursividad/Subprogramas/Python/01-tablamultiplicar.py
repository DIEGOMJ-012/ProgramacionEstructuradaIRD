def solicitarValor():
    sentinel = True
    while sentinel:
        Valor = input('Ingresar un numero ')

        if Valor.isdigit():
            if Valor > 0:
                sentinel = False
            else:
                print(Valor, 'No puede ser 0 o Negativo')
        else:
            print(Valor, "No es Entero")
    return Valor
def calcularTabla(Valor):
    salida=''
    for i in range (1,11):
        salida+=f'{Valor} * {i} = {Valor*i}\n'
        return salida
numeroTabla = solicitarValor()
salida = calcularTabla(numeroTabla)
print(salida)