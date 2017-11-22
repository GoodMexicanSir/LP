=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("\nIngrese la magnitud del vector:\n -->")
n = gets().to_i

a = Array.new(n)
suma = 0

for i in(0...n)
	print("Ingresa el valor de vector[#{i}]: ")
	a[i] = gets().to_i
end

print("\nIngrese el valor a buscar:");
b = gets().to_i

for i in(0...n)
	if (a[i]==b)then
		suma = suma + 1
	end
end

puts("Valor a buscar: #{b}")
puts("El numero aparecio #{suma} veces en el vector")
puts("#{a}")