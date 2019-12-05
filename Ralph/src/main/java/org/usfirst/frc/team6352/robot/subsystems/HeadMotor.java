package org.usfirst.frc.team6352.robot.subsystems;

import org.usfirst.frc.team6352.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 * The subsystem that sucks in and spits out the power cube.
 */
public class HeadMotor extends Subsystem
{
	private SpeedController headMotor;
	
	public HeadMotor()
	{
		headMotor = new Victor(RobotMap.headDrivePwmChannel);
	}

	// Stop both motors
	public void stop()
	{
		headMotor.stopMotor();
	}
	
	public void spin(double speed)
	{
		set(speed);
	}

	public void set(double speed)
	{
		headMotor.set(speed);
	}
	
	public void initDefaultCommand()
	{
	}
	
}
