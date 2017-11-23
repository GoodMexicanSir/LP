=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

salida = ""

print("\nIngrese el numero de filas --> ")
f = gets().to_i
print("Ingrese el numero de columnas --> ")
c = gets().to_i

#Declaración de una matriz
# nombre de la matriz = Array.new(variable de filas){Array.new(variable de columnas)}
matriz = Array.new(f){Array.new(c)}
print("\n")

for i in (0...f)
   for j in (0...c)
      print("Ingrese el valor de matriz[#{i}][#{j}]: ")
	  matriz[i][j] = gets().to_i
   end
end

print("\nIngrese el valor a buscar: ")
b = gets().to_i

for i in (0...f)
   for j in (0...c)
      if(matriz[i][j] == b) then
	     suma = suma.to_i + 1
      end
	  salida = salida + matriz[i][j].to_s + " "
   end
   salida = salida + "\n"
end

print("\nMatriz[#{f}][#{c}] \n#{salida}\nElemento a buscar: #{b}\nEl #{b} aparece #{suma} veces\n")