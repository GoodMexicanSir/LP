=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("Ingrese el numero de terminos: ")
n = gets().to_i

serie = ""
x = 0
y = 2
z = 1
a = 0
b = -3
c = 2

if(n>0)then
	serie = serie + "2"

	for i in(1...n)
		serie = serie + ", "

		if(z==0)then
			c = c + 2
			serie = serie + c.to_s

			if(x<a)then
				x = x + 1
			else
				z = 1
				x = 0
			end
		elsif(z==1)then
			serie = serie + b.to_s
			b = b - 2
			if(x<y)then
				x = x + 1
			else
				z = 0
				x = 0
				a = a + 1
			end
		end
	end
end

print(serie)