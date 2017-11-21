=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("Ingrese el total de numeros: ")
n = gets().to_i
serie = ""

for i in (1...n)
	a = (i*2)-1;
	b = i**a
	serie = serie + b.to_s+", "
end

a = (i*2)-1;
b = i**a
serie = serie + b.to_s+"."

print(serie)