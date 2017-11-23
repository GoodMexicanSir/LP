=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

fibo = 1
a = 1
b = 0
serie = Array.new(100)

for i in(1..100)
	fibo = a + b;
	a = b;
	b = fibo;

	serie[i] = fibo;
end

puts(serie)