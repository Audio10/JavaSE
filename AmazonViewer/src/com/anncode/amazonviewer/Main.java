package com.anncode.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.anncode.amazonviewer.model.Chapter;
import com.anncode.amazonviewer.model.Movie;
import com.anncode.amazonviewer.model.Serie;

public class Main {

	public static void main(String[] args) {
		showMenu();

	}

	public static void showMenu() {

		byte option = 0;
		do {
			Scanner writer = new Scanner(System.in);

			System.out.println("BIENVENIDOS AMAZON VIEWER");
			System.out.println();
			System.out.println("Selecciona el n�mero de la opci�n deseada");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("5. Report");
			System.out.println("6. Report Today");
			System.out.println("0. Exit");
			option = writer.nextByte();
			switch (option) {

			case 1:
				showMovies();
				break;
			case 2:
				showSeries();
				break;
			case 3:
				showBooks();
				break;
			case 4:
				showMagazines();
				break;
			case 5:
				makeReport();
				break;
			case 6:
				makeReport(new Date());
				break;
			default:
				System.out.println("Bye");
				break;
			}
		} while (option != 0);
	}

	public static void showMovies() {
		byte response = 0;
		ArrayList<Movie> movies = Movie.makeMoviesList();
		do {
			System.out.println();
			System.out.println(":: MOVIES ::");
			System.out.println();

			for (Movie movie : movies) {
				System.out.println(movie.getTitle() + " Visto: " + movie.isViewed());
			}

			System.out.println("0 Regresar al Menu");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			response = scanner.nextByte();
			
			if (response != 0) {
				Movie movieSelected = movies.get(response - 1);
				movieSelected.setViewed(true);
				Date dateI = movieSelected.startToSee(new Date());

				for (int i = 0; i < 1000; i++) {
					System.out.println(".........");
				}

				// Terminar de verla
				movieSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste esta pelicula: " + movieSelected.toString());
				System.out.println("Por: " + movieSelected.getTimeViewed() + " milisegundos.");
			}

		} while (response != 0);
	}

	public static void showSeries() {
		byte response = 0;
		ArrayList<Serie> series = Serie.makeSeriesList();
		do {
			System.out.println();
			System.out.println(":: Series ::");
			System.out.println();

			for (Serie serie : series) {
				System.out.println(serie.getTitle() + " Visto: " + serie.isViewed());
			}

			System.out.println("0 Regresar al Menu");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			response = scanner.nextByte();
			
			if (response != 0) {
				showChapters(series.get(response-1).getChapters());
			}
			
		} while (response != 0);
	}

	public static void showBooks() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: Books ::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showMagazines() {
		int exit = 1;
		do {
			System.out.println();
			System.out.println(":: Magazines ::");
			System.out.println();
		} while (exit != 0);
	}

	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
		int response = 0;
		do {
			System.out.println();
			System.out.println(":: Chapters ::");
			System.out.println();
			
			for (Chapter chapter : chaptersOfSerieSelected) {
				System.out.println(" Titulo: " + chapter.getTitle() + " Visto " + chapter.isViewed());
			}
			
			System.out.println("0 Regresar al Menu");
			System.out.println();

			Scanner scanner = new Scanner(System.in);
			response = scanner.nextByte();
			
			if (response != 0) {
				Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
				chapterSelected.setViewed(true);
				Date dateI = chapterSelected.startToSee(new Date());
				
				for (int i = 0; i < 10000; i++) {
					System.out.println("..........");
				}
				
				chapterSelected.stopToSee(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + chapterSelected);
				System.out.println("Por: "+ chapterSelected.getTimeViewed() + "milisegundos");
			}
			
		} while (response != 0);
	}

	public static void makeReport() {

	}

	public static void makeReport(Date data) {

	}

}
