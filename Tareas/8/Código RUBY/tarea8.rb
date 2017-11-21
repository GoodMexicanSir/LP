=begin
	Nombre: Leslie Estefanía Pérez Cerda
	Matrícula: 1737535
	Hora: Jueves V4-V6
=end

begin
	puts "\e[H\e[2J"
	print("\n\t\tMenu principal\n")
	print("\t\t==============\n")
	print("\t1.- Calcular area de Cuadrado\n")
	print("\t2.- Calcular area de Rectangulo\n")
	print("\t3.- Calcular area de Triangulo\n")
	print("\t4.- Calcular area de Circulo\n")
	print("\t5.- Salir\n")
	print("\nSelecciona una opción --> ")
	n=gets().to_i

	case n
		when 1
			print("\nIngrese la longitud del lado: ")
			a = gets().to_i
			b = a*a
			print("\tEl area del cuadrado es #{b}")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 2
			print("\nIngrese la longitud de la base: ")
			a = gets().to_i
			print("Ingrese la longitud de la altura: ")
			b = gets().to_i
			c = a*b
			print("\tEl area del rectangulo es #{c}")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 3
			print("nIngrese la longitud de la base: ")
			a = gets().to_f
			print("Ingrese la longitud de la altura: ")
			b = gets().to_f
			c = (a*b)/2
			print("\tEl area del triangulo es #{c}")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		when 4
			print("\nIngrese la longitud del radio: ")
			a = gets().to_f
			b = (3.1416*a)/2
			print("\tEl area del circulo es #{b}")
			print("\n\nPresione cualquier tecla para volver al menu")
			gets
		else
			puts "\e[H\e[2J"
	end
end while n != 5