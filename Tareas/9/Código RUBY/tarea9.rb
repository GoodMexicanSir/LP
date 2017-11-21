=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

begin
	puts "\e[H\e[2J"
	print("\n\t\tMenu principal\n")
	print("\t\t==============\n")
	print("\tConvertir de . . .\n")
	print("\t1.- Grados Celcius a grados Farenheit\n")
	print("\t2.- Grados Farenheit a grados Celcius\n")
	print("\t3.- Salir\n")
	print("\nSelecciona una opción --> ")
	n=gets().to_i

	case n
		when 1
			print("\nIngrese los grados a convertir: ")
			a = gets().to_f
			b = (a*1.8) + 32;
			print("\t#{a} grados Celcius equivalen a #{b} grados Farenheit")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 2
			print("\nIngrese los grados a convertir: ")
			a = gets().to_f
			b = (a - 32)/1.8;
			print("\t#{a} grados Farenheit equivalen a #{b} grados Celcius")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		else
			puts "\e[H\e[2J"
	end
end while n != 3