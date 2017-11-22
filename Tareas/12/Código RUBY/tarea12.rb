=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("Ingrese el numero de terminos: ")
n = gets().to_i

serie = ""
y = 1
x = 0
z = 1
a = 2

if(n>0)then
	serie = serie + "-1";

	for i in(1...n)
		serie = serie + ", "
		if (z == 0)then
			serie = serie + (a*-1).to_s

			z = 1
			x = 0
			a = a + 1
		elsif(z == 1)then
			serie = serie + a.to_s

			if (x<y)then
				x = x + 1
			else
				z = 0
				a = a + 1
				y = y + 1
			end
		end
	end
end

print(serie)