=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

salidaC = ""

print("\nIngrese el numero de filas --> ")
f = gets().to_i
print("Ingrese el numero de columnas --> ")
c = gets().to_i

#Declaración de una matriz
# nombre de la matriz = Array.new(variable de filas){Array.new(variable de columnas)}
matrizA = Array.new(f){Array.new(c)}
matrizB = Array.new(f){Array.new(c)}
matrizC = Array.new(f){Array.new(c)}
print("\n")

for i in (0...f)
   for j in (0...c)
      print("Ingrese el valor de A[#{i}][#{j}]: ")
	  matrizA[i][j] = gets().to_i
   end
end

print("\n")
for i in (0...f)
   for j in (0...c)
      print("Ingrese el valor de B[#{i}][#{j}]: ")
     matrizB[i][j] = gets().to_i
   end
end

for i in (0...f)
   for j in (0...c)
      matrizC[i][j] = matrizA[i][j] + matrizB[i][j]

      salidaC = salidaC + matrizC[i][j].to_s + " "
   end
   salidaC = salidaC + "\n"
end

print("\n[A] + [B] = [C]\n\n#{salidaC}")