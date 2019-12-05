package org.usfirst.frc.team6352.robot.commands;

import org.usfirst.frc.team6352.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * A command for controlling the power cube intake 
 */
public class SpinKey extends Command
{
	private Boolean run = false;
	
	
	public SpinKey()
	{
		requires(Robot.keyMotor);
	}
	
	public SpinKey(Boolean runBoolean)
	{
		this();
		this.run = runBoolean;
	}
	
	
	// Called just before this Command runs the first time
	@Override
	protected void initialize()
	{
        Robot.keyMotor.stop();
	}

	// Called repeatedly when this Command is scheduled to run
	protected void execute()
	{
        if (run)
        {
            Robot.keyMotor.spin();
        }
        else
        {
            Robot.keyMotor.stop();
        }
	}

	// Make this return true when this Command no longer needs to run execute()
	protected boolean isFinished()
	{
		return isCanceled();
	}

	// Called once after isFinished returns true
	protected void end()
	{
		
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	protected void interrupted()
	{
		end();
	}
}
