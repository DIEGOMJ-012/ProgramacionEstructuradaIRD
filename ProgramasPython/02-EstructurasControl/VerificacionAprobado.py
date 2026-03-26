# Solicitud de calificaciones 
calif1 = float(input("Introduce la calif1"))
calif2 = float(input("Introduce la calif2"))
calif3 = float(input("Introduce la calif3"))

promedio = (calif1+calif2+calif3) / 3
if promedio >= 7.0:
    print('Aprobado')
    if promedio >= 7.1 and promedio <=8.0:
        print('Aprobado Bajo')
    elif promedio >= 7.1 and promedio <=8.0:
         print('Aprobado Media')
    else:
        print('Aprobado Alto')
else: 
    print("No Aprobado")