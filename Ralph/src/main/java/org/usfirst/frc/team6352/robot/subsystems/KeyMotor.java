package org.usfirst.frc.team6352.robot.subsystems;

import org.usfirst.frc.team6352.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * The subsystem that sucks in and spits out the power cube.
 */
public class KeyMotor extends Subsystem
{
	private Relay keyMotorRelay;
	
	public KeyMotor()
	{
		keyMotorRelay = new Relay(RobotMap.keyDriveRelayChannel);
	}

	// Stop both motors
	public void stop()
	{
		keyMotorRelay.set(Relay.Value.kForward);
	}
	
	public void spin()
	{
		keyMotorRelay.set(Relay.Value.kOn);
	}
	
	public void initDefaultCommand()
	{
	}
	
}
