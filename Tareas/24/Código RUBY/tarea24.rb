=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

salidaC = ""

print("\nIngrese el numero de filas de [A] --> ")
fA = gets().to_i
print("Ingrese el numero de columnas de [A]--> ")
cA = gets().to_i
matrizA = Array.new(fA){Array.new(cA)}

for i in (0...fA)
   for j in (0...cA)
      print("Ingrese el valor de A[#{i}][#{j}]: ")
	  matrizA[i][j] = gets().to_i
   end
end

print("\nIngrese el numero de filas de [B] --> ")
fB = gets().to_i
print("Ingrese el numero de columnas de [B]--> ")
cB = gets().to_i
matrizB = Array.new(fB){Array.new(cB)}

for i in (0...fB)
   for j in (0...cB)
      print("Ingrese el valor de B[#{i}][#{j}]: ")
	  matrizB[i][j] = gets().to_i
   end
end

if(cA == fB)
	matrizC = Array.new(fB){Array.new(cA)}

	for i in(0..fB)
		for j in(0..cA)
			matrizC[i][j] = matrizC[i][j] + matrizA[i][j] + matrizB[j][i]
		end
	end

	for i in (0...fB)
   		for j in (0...cA)
      		salidaC = salidaC + matrizC[i][j].to_s + " "
   		end
   		salidaC = salidaC + "\n"
	end

elsif(cB == fA)
	matrizC = Array.new(fA){Array.new(cB)}

	for i in(0..fA)
		for j in(0..cB)
			matrizC[i][j] = matrizC[i][j] + matrizB[i][j] + matrizA[j][i]
		end
	end

	for i in (0...fA)
   		for j in (0...cB)
      		salidaC = salidaC + matrizC[i][j].to_s + " "
   		end
   		salidaC = salidaC + "\n"
	end

else
	print("\nLas matrices no son multiplicables")
end

print("\n[A] * [B] = [C]\n\n#{salidaC}")