package Actividad1;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.Empleado;

public class testHerencia2 {
	public static void main(String[] args) {

		Productos[] productos = new Productos[9]; //agregar todos los productos acá

		ProductosFrescos productoF1 = new ProductosFrescos(LocalDate.of(2024, 5, 11), 12345, LocalDate.now(), "España");
		ProductosFrescos productoF2 = new ProductosFrescos(LocalDate.of(2024, 8, 31), 98620, LocalDate.of(2023, 2, 21),
				"Marruecos");
		ProductosFrescos productoF3 = new ProductosFrescos(LocalDate.of(2024, 11, 8), 45111, LocalDate.now(),
				"Colombia");

//		CREACIÓN DE 3 PRODUCTOS FRESCOS
//		UN ARRAY DONDE LOS AGREGO 
		// ProductosFrescos[] productosFr = {productoF1, productoF2, productoF3};

		System.out.println("-----Lista de productos Frescos-----\n");
		for (ProductosFrescos productosF : productosFr) {
			System.out.println(productosF);
		}

		ProductosRefrigerados productoR1 = new ProductosRefrigerados(LocalDate.of(2025, 7, 1), 47510, 784511);
		ProductosRefrigerados productoR2 = new ProductosRefrigerados(LocalDate.of(2024, 12, 30), 774415, 103547);
		ProductosRefrigerados productoR3 = new ProductosRefrigerados(LocalDate.of(2026, 1, 19), 98497, 032417);

//		CREACIÓN DE 3 PRODUCTOS REFRIGERADOS 
//		UN ARRAY DONDE LOS AGREGO

		// ProductosRefrigerados[] productosRe = {productoR1,productoR2,productoR3};

		System.out.println("\n-----Lista de productos Refrigerados-----\n");
		for (ProductosRefrigerados productosR : productosRe) {
			System.out.println(productosR);
		}

		ProductosCongelados productoC1 = new ProductosCongelados(LocalDate.of(2025, 9, 11), 54474, -5.0);
		ProductosCongelados productoC2 = new ProductosCongelados(LocalDate.of(2024, 3, 27), 102478, -18.0);
		ProductosCongelados productoC3 = new ProductosCongelados(LocalDate.of(2025, 5, 3), 985513, -12.0);

		// ProductosCongelados[] productosC = {productoC1,productoC2,productoC3};
		System.out.println("\n-----Lista de productos Congelados-----\n");
		for (ProductosCongelados productosCon : productosC) {
			System.out.println(productosCon);

		}

	}

}
