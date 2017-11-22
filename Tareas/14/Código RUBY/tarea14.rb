=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("Ingrese el numero de terminos: ")
n = gets().to_i

serie = ""
i = 1
for i in(1...n)
	a = 1.0/i

	serie = serie + a.to_s + ", "
end

a = 1.0/n
serie = serie + a.to_s + "."

print(serie)