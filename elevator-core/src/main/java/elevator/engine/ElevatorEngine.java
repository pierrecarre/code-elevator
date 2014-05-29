package elevator.engine;

import elevator.Command;
import elevator.Direction;
import elevator.User;
import elevator.exception.ElevatorIsBrokenException;

public interface ElevatorEngine {

	public final static Integer LOWER_FLOOR = -13;
	public final static Integer HIGHER_FLOOR = 27;

	public ElevatorEngine call(Integer atFloor, Direction to)
			throws ElevatorIsBrokenException;

	public ElevatorEngine go(Integer cabin, Integer floorToGo)
			throws ElevatorIsBrokenException;

	public Command[] nextCommands() throws ElevatorIsBrokenException;

	public ElevatorEngine userHasEntered(Integer cabin, User user)
			throws ElevatorIsBrokenException;

	public ElevatorEngine userHasExited(Integer cabin, User user)
			throws ElevatorIsBrokenException;

	public ElevatorEngine reset(Integer lowerFloor, Integer higherFloor,
			Integer cabinSize, Integer cabinCount, String cause)
			throws ElevatorIsBrokenException;

}
