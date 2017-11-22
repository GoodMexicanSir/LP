=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

l1 = 300
l2 = 450
l3 = 550
l4 = 670
l5 = 800
l6 = 1200
t1 = 0
t2 = 0
t3 = 0
t4 = 0
t5 = 0
t6 = 0

begin
	puts("\nSelecciona el tipo de localidad deseado:")
	puts("========================================")
	print(" 1.- L1 = $300\n 2.- L2 = $450\n 3.- L3 = $550\n 4.- L4 = $670\n 5.- L5 = $800\n 6.- L6 = $1200\n -->")
	n = gets().to_i

	case n
		when 1
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l1
			t1 = t1+n
		when 2
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l2
			t2 = t2+n
		when 3
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l3
			t3 = t3+n
		when 4
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l4
			t4 = t4+n
		when 5
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l5
			t5 = t5+n
		when 6
			print("\nIngrese la cantidad de boletos deseados:\n -->")
			n = gets().to_i
			ven = n*l6
			t6 = t6+n
		else
			puts("ERROR")
	end

	print("Total de la compra = $#{ven}\n\n")
	puts("========================================")
	print("Desea comprar otra localidad?\n\n 1.- Si\n 2.- No\n -->")
	n = gets().to_i
	puts "\e[H\e[2J"
end while n != 2
n = t1*l1 + t2*l2 + t3*l3 + t4*l4 + t5*l5 + t6*l6
puts("==========================")
puts("Total de boletos vendidos:")
puts("==========================")
print(" L1 = #{t1}\n L2 = #{t2}\n L3 = #{t3}\n L4 = #{t4}\n L5 = #{t5}\n L6 = #{t6}\n")
puts("==========================")
puts("Recaudacion total = $#{n}")