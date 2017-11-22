=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

sum = 0
prom = 0
c = 0
m = 0
por = 0.0

print("\nIngrese la cantidad de alumnos:\n --> ")
n = gets().to_i

a = Array.new(n)

for i in(0...n)
	print("Ingrese la calificacion del alumno #{i+1} --> ")
	a[i] = gets().to_i
end

for i in(0..n)
	sum = sum + a[i].to_i
	if( a[i].to_i >= 1300 )then
		c = c + 1
		if( a[i].to_i >=1500 )then
			m = m + 1
		end
	end
end

prom = sum/n
por = (c*100)/n

print("\n")
puts("Promedio general del grupo: #{prom}")
puts("Porcentaje de alumnos aprobados: #{por}%")
puts("Numero de alumnos cuya calificacion es mayor o igual a 1500: #{m}")