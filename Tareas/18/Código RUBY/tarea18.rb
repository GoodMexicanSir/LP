=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

print("\nIngrese la magnitud del vector:\n -->")
n = gets().to_i

a = Array.new(n)
pos = 0
neg = 0
nul = 0

for i in(0...n)
	print("Ingresa el valor de vector[#{i}]: ")
	a[i] = gets().to_i
end

for i in(0...n)
	if (a[i]>0)then
		pos = pos + 1
	elsif (a[i]<0)then
		neg = neg + 1
	else
		nul = nul + 1
	end
end

print("\n#{a}\n")
puts("Valores positivos: #{pos}")
puts("Valores negativos: #{neg}")
puts("Valores nulos: #{nul}")