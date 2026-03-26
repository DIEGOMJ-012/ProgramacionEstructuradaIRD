menu = '''
                ===== Menu General ===== +
                1/A)Promedio de Calificaciones +
                2/B)Promedio de Calificaciones +
                3/C)Promedio de Calificaciones +
                4/S)Salir +
                Elegir Opcion: 
            '''
sentinela = True

while(sentinela):
    opcion = input(menu).upper()

    if opcion == "1" or opcion =='A':
        print('Opcion 1')
    elif opcion == "2" or opcion =='B':
            print('Option 2')
    elif opcion == "3" or opcion =='c':
            print('Option 3')
    elif opcion == "4" or opcion =='S':
            print('Salir')
    sentinela=False 
else:
    print('Opcion no valida') 
print  ('Programa Termiando')