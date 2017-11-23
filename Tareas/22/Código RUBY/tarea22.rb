=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("Ingrese el numero de filas --> ")
f = gets().to_i
print("Ingrese el numero de columnas --> ")
c = gets().to_i

matA = Array.new(f)
matB = Array.new(c)

matA = [ matA[i], matA[j] ]

for i in(1..f)
	for j in(1..c)
		print("Ingrese el valor de matriz[#{i}][#{j}] --> ")
		sig = gets().to_i
		matA[i] = matA + sig
	end
end

print("")