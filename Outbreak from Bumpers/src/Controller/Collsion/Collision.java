package Controller.Collsion;


/**
 * This class defines the behavior when two cars collide.
 */
public class Collision {


	private final boolean crash;

	public Collision() {

		this.crash = detectCollision();
	}

	public boolean isCrash() {
		return crash;
	}

	public boolean detectCollision() {

		return true;
	}

	/**
	 * Evaluates winner of the collision.
	 *
	 * @return winner Car
	 */

	/**
	 * Evaluates loser of the collision.
	 *
	 * @return loser Car
	 */

}
