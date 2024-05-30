tareas = []

# Función para mostrar el menú
def mostrar_menu():
    print("\nMenú:")
    print("1. Agregar tarea")
    print("2. Eliminar tarea")
    print("3. Mostrar tareas")
    print("4. Salir")

# Función para agregar una tarea a la lista
def agregar_tarea():
    tarea = input("Ingrese la tarea: ")
    tareas.append(tarea)
    print(f"Tarea '{tarea}' agregada.")

# Función para eliminar una tarea de la lista
def eliminar_tarea():
    mostrar_tareas()
    indice = int(input("Ingrese el número de la tarea a eliminar: "))
    if 0 <= indice < len(tareas):
        tarea_eliminada = tareas.pop(indice)
        print(f"Tarea '{tarea_eliminada}' eliminada.")
    else:
        print("Indice inválido.")

# Función para mostrar todas las tareas
def mostrar_tareas():
    if not tareas:
        print("No hay tareas pendientes.")
    else:
        print("\nLista de Tareas Pendientes:")
        for i, tarea in enumerate(tareas):
            print(f"{i}. {tarea}")

# Función principal del programa
def main():
    while True:
        mostrar_menu()
        opcion = input("Seleccione una opción: ")
        
        if opcion == '1':
            agregar_tarea()
        elif opcion == '2':
            eliminar_tarea()
        elif opcion == '3':
            mostrar_tareas()
        elif opcion == '4':
            print("Chao")
            break
        else:
            print("Opción inválida. Intente de nuevo.")

# Ejecutar el programa principal
if __name__ == "__main__":
    main()