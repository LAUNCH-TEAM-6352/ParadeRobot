package org.usfirst.frc.team6352.robot.commands;

import org.usfirst.frc.team6352.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * A command for controlling the power cube intake 
 */
public class SpinHead extends Command
{
	private String motorSpeedKey = null;
	
	private double motorSpeed;
	
	
	public SpinHead()
	{
		requires(Robot.headMotor);
	}
	
	public SpinHead(String motorSpeedKey)
	{
		this();
		this.motorSpeedKey = motorSpeedKey;
	}
	
	public SpinHead(double motorSpeed)
	{
		this();
		this.motorSpeed = motorSpeed;
	}
	
	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
		if (motorSpeedKey != null)
		{
			motorSpeed = SmartDashboard.getNumber(motorSpeedKey, 0.0);
		}
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
		Robot.headMotor.set(motorSpeed);
		//Robot.powerCubeIntake.set(motorSpeed);
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return isCanceled();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		Robot.headMotor.stop();
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
