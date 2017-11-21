=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

begin
	puts "\e[H\e[2J"
	print("\n\t\tMenu principal\n")
	print("\t\t==============\n")
	print("\tConvertir de Pesos a . . .\n")
	print("\t1.- Dolares\n")
	print("\t2.- Euros\n")
	print("\t3.- Yenes\n")
	print("\t4.- Dolares de Hong Kong\n")
	print("\t5.- Salir\n")
	print("\nSelecciona una opción --> ")
	n=gets().to_i

	case n
		when 1
			print("\nIngrese la cantidad a convertir: ")
			a = gets().to_f
			b = a*0.05265;
			print("\t#{a} Pesos equivalen a #{b} Dolares")
			print("\n\n\tTasa de cambio:\n\t1 MXP = 0.05265 USD")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 2
			print("\nIngrese la cantidad a convertir: ")
			a = gets().to_f
			b = a*0.04487;
			print("\t#{a} Pesos equivalen a #{b} Euros")
			print("\n\n\tTasa de cambio:\n\t1 MXP = 0.04487 EUR")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 3
			print("nIngrese la cantidad a convertir: ")
			a = gets().to_f
			b = a*5.91789;
			print("\t#{a} Pesos equivalen a #{b} Yenes")
			print("\n\n\tTasa de cambio:\n\t1 MXP = 5.91789 JPY")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 4
			print("\nIngrese la cantidad a convertir: ")
			a = gets().to_f
			b = a*0.40984;
			print("\t#{a} Pesos equivalen a #{b} Dolares de Hong Kong")
			print("\n\n\tTasa de cambio:\n\t1 MXP = 0.40984 HKD")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		else
			puts "\e[H\e[2J"
	end
end while n != 5