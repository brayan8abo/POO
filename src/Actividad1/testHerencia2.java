package Actividad1;

import java.time.LocalDate;
import java.util.ArrayList;

import poo2.Empleado;

public class testHerencia2 {
	public static void main(String[] args) {

		Producto[] productos = new Producto[9]; // agregar todos los productos acá

		ProductoFresco productoF1 = new ProductoFresco(LocalDate.of(2024, 5, 11), 12345, LocalDate.now(), "España");
		ProductoFresco productoF2 = new ProductoFresco(LocalDate.of(2024, 8, 31), 98620, LocalDate.of(2023, 2, 21),
				"Marruecos");
		ProductoFresco productoF3 = new ProductoFresco(LocalDate.of(2024, 11, 8), 45111, LocalDate.now(), "Colombia");

		ProductoRefrigerado productoR1 = new ProductoRefrigerado(LocalDate.of(2025, 7, 1), 47510, 784511);
		ProductoRefrigerado productoR2 = new ProductoRefrigerado(LocalDate.of(2024, 12, 30), 774415, 103547);
		ProductoRefrigerado productoR3 = new ProductoRefrigerado(LocalDate.of(2026, 1, 19), 98497, 032417);

		ProductoCongelado productoC1 = new ProductoCongelado(LocalDate.of(2025, 9, 11), 54474, -5.0);
		ProductoCongelado productoC2 = new ProductoCongelado(LocalDate.of(2024, 3, 27), 102478, -18.0);
		ProductoCongelado productoC3 = new ProductoCongelado(LocalDate.of(2025, 5, 3), 985513, -12.0);

		productos[0] = productoF1;
		productos[1] = productoF2;
		productos[2] = productoF3;
		productos[3] = productoR1;
		productos[4] = productoR2;
		productos[5] = productoR3;
		productos[6] = productoC1;
		productos[7] = productoC2;
		productos[8] = productoC3;

//		for (int i = 0; i < productos.length; i++) {
//			System.out.println(productos[i]);
//
//		}
		for (Producto producto : productos) {
			System.out.println(producto + "\n");
			
		}

	}

}
