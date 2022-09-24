package gestion;

import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<Animal>();
	
	public Zona(String nombre, Zoologico lugar) {
		this.nombre = nombre;
		zoo = lugar;
	}
