#Funcion que no retorna Valor y no recibe parametros
def saludar():
    print("Hola Funciones")

#Funcion que recibe parametros pero no retorna valores
def saludar2(nombre):
    print('Hola', nombre)

#Funcion con retorno
def sumar(a, b):
    return a + b

#Funcion con parametros por posicion
def multi (x,y):
    return x * y

#Funcion con multiples valores de retorno
def operaciones (a, b):
    suma = a + b
    resta = a - b
    return suma, resta

#Funcion con valor con defecto
def saludar2(nombre = 'Invitado'):
    print("Hola 'Ing.", nombre)

#Funcion con Parametros arbitriarios
def sumar_todos (*numeros):
    return sum(numeros)


saludar()
saludar2('Tilin')
suma = sumar (10, 2)
print (suma)
print (sumar(56,5))
print (multi(10,9))

#Parametros por nombre
m = multi(y=23, x=15)
s, m2 = operaciones(10, 2)
print (f'La suma es: {s} y la resta es: {m2}')
saludar2()
saludar2('Diego')
print(sumar_todos(2,3,4,5,6))