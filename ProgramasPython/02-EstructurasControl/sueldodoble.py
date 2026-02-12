nombre = input('Introduce el nombre ')
horas_traba = int(input('Introduce las horas trabajadas '))
costo_hora = float(input('Introduce la cuota por hora '))

horas_extra = 0
sueldo = 0.0

if horas_traba > 40 :
    horas_extra = horas_traba - 40
    sueldo = sueldo * costo_hora + costo_hora * 2
elif horas_traba > 0 :
    sueldo = horas_traba * costo_hora
else :
    print('Horas trabajadas no valida')
salida = f"""
          ===== Nomina =====
          Nombre: {nombre}
          Horas Trabajada : {horas_traba}
          Horas Extra : {horas_extra}
          Sueldo : {sueldo}
          """
print = salida
