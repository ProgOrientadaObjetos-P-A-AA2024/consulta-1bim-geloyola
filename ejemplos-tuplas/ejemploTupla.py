# Definir una tupla con la información de un estudiante
estudiante = ("Juan Pérez", 21, "Ingeniería Informática")

# Mostrar la información del estudiante
print("Nombre:", estudiante[0])
print("Edad:", estudiante[1])
print("Carrera:", estudiante[2])

# Intentar modificar un elemento de la tupla (esto causará un error)
try:
    estudiante[1] = 22
except TypeError as e:
    print("\nError:", e)

# Recorrer los elementos de la tupla
print("\nInformación del estudiante:")
for elemento in estudiante:
    print(elemento)

# Desempaquetar la tupla en variables individuales
nombre, edad, carrera = estudiante
print("\nDesempaquetado:")
print("Nombre:", nombre)
print("Edad:", edad)
print("Carrera:", carrera)