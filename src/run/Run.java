package run;

import controller.Controller;

/** Clase que maneja el objeto Run.java
 *
 * @author Cristian David Parada Martinez
 * @date 11/08/2022
 *
 */
public class Run {
	public static void main(String[] args) {
		Controller.getInstance().init();
	}
}
