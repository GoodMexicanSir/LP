=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

pe = 0
pro = 0
con = 0
m = 0
mayor = 0

meses = Array.new(12)

meses[0]="Enero"
meses[1]="Febrero"
meses[2]="Marzo"
meses[3]="Abril"
meses[4]="Mayo"
meses[5]="Junio"
meses[6]="Julio"
meses[7]="Agosto"
meses[8]="Septiembre"
meses[9]="Octubre"
meses[10]="Noviembre"
meses[11]="Diciembre"

ton = Array.new(12)

for i in(0...12)
	print("\nIngrese las toneladas de cereales producidas en:\n#{meses[i]} --> ")
	ton[i] = gets().to_i
	pe = pe + ton[i].to_i
end

pro = pe/12

for i in(0..12)
	if(ton[i].to_i>pro)then
		con = con + 1
	end

	if(ton[i].to_i>mayor)then
		mayor = ton[i].to_i
		m = i
	end
end

print("\n")
puts("Promedio anual de toneladas cosechadas: #{pro}")
puts("#{con} meses tuvieron una cosecha superior al promedio")
puts("Mes de mayor produccion #{meses[m]} con #{ton[m]} toneladas")