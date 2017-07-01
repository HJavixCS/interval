package mma.legacy.interval;
import org.apache.log4j.Logger;

/**
 * Clase para el ejemplo de trabajo con Legacy
 * 
 * @author Agustin Controla operaciones sobre intervalos que pueden ser abiertos
 *         o cerrados (en uno o ambos extremos)
 */
public class Interval {
	
	final static Logger logger = Logger.getLogger(Interval.class);
	
	private double minimum; 	// número entero que indica el límite superior del intervalo
	private double maximum; 	// número entero que indica el límite superior del intervalo
	private Opening opening; 	// Valor booleano que indica si el intervalo es abierto o cerrado

	/**
	 * @param minimum	
	 * @param maximum
	 * @param opening
	 * Todos los parámetros pueden ser nulos
	 */
	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
		logger.info("Objeto creado");
	}

	/**
	 * Calcula el punto medio de un intervalo
	 * 
	 */
	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	/**
	 * Evalua si un número está dentro de un determinado intervalo
	 * @param value
	 * @return true: valor dentro del intervalo, false: valor fuera del intervalo
	 */
	public boolean includesValue(double value) {
		System.out.print("Entro en el método");
		switch (opening) {
		case BOTH_OPENED:
			return minimum < value && value < maximum;
		case LEFT_OPENED:
			return minimum < value && value <= maximum;
		case RIGHT_OPENED:
			return minimum <= value && value < maximum;
		case UNOPENED:
			return minimum <= value && value <= maximum;
		default:
			return false;
		}
	}

	/**
	 * Evalua si el intervalo está dentro del un intervalo pasado como parámetro
	 * 
	 * @param interval
	 * @return true: intervalo dentro del intervalo, false: intervalo fuera del intervalo
	 */
	public boolean includesInterval(Interval interval) {
		boolean minimumIncluded = this.includesValue(interval.minimum);
		boolean maximumIncluded = this.includesValue(interval.maximum);
		switch (opening) {
		case BOTH_OPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum) && (maximumIncluded);
			case RIGHT_OPENED:
				return (minimumIncluded) && (maximumIncluded || maximum == interval.maximum);
			case UNOPENED:
				return (minimumIncluded) && (maximumIncluded);
			default:
				return false;
			}
		case LEFT_OPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case RIGHT_OPENED:
				return (minimumIncluded) && (maximumIncluded || maximum == interval.maximum);
			case UNOPENED:
				return (minimumIncluded) && (maximumIncluded || maximum == interval.maximum);
			default:
				return false;
			}
		case RIGHT_OPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum) && (maximumIncluded);
			case RIGHT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case UNOPENED:
				return (minimumIncluded || minimum == interval.minimum) && (maximumIncluded);
			default:
				return false;
			}
		case UNOPENED:
			switch (interval.opening) {
			case BOTH_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case LEFT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case RIGHT_OPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			case UNOPENED:
				return (minimumIncluded || minimum == interval.minimum)
						&& (maximumIncluded || maximum == interval.maximum);
			default:
				return false;
			}
		default:
			return false;
		}
	}

	/**
	 * Calcula si un intervalo intersecta con otro
	 * 
	 * @param interval
	 * @return true: Solo si los intervalos se intersectan
	 */

	public boolean intersectsWith(Interval interval) {
		if (minimum == interval.maximum) {
			switch (opening) {
			case BOTH_OPENED:
			case LEFT_OPENED:
				return false;
			case RIGHT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.LEFT_OPENED || interval.opening == Opening.UNOPENED;
			default:
				return false;
			}
		}
		if (maximum == interval.minimum) {
			switch (opening) {
			case BOTH_OPENED:
			case RIGHT_OPENED:
				return false;
			case LEFT_OPENED:
			case UNOPENED:
				return interval.opening == Opening.RIGHT_OPENED || interval.opening == Opening.UNOPENED;
			default:
				return false;
			}
		}
		return this.includesValue(interval.minimum) || this.includesValue(interval.maximum);
	}

}
