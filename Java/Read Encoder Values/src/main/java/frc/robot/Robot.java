/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Robot extends TimedRobot {
  // private Joystick m_stick;
  private static final int deviceID = 1;
  private CANSparkMax m1_motor;
  private CANSparkMax m2_motor;
  private CANSparkMax m3_motor;
  private CANSparkMax m4_motor;

  private RelativeEncoder m1_encoder;

  private RelativeEncoder m2_encoder;
  private RelativeEncoder m3_encoder;

  private RelativeEncoder m4_encoder;

  @Override
  public void robotInit() {
    // initialize SPARK MAX
    m1_motor = new CANSparkMax(22, MotorType.kBrushless);
    m2_motor = new CANSparkMax(20, MotorType.kBrushless);
    m3_motor = new CANSparkMax(21, MotorType.kBrushless);
    m4_motor = new CANSparkMax(24, MotorType.kBrushless);
    // m5_motor = new CANSparkMax(deviceID, MotorType.kBrushless);

    /**
     * The RestoreFactoryDefaults method can be used to reset the configuration parameters
     * in the SPARK MAX to their factory default state. If no argument is passed, these
     * parameters will not persist between power cycles
     */
    m1_motor.restoreFactoryDefaults();

    m2_motor.restoreFactoryDefaults();

    m3_motor.restoreFactoryDefaults();

    m4_motor.restoreFactoryDefaults();
    // m5_motor.restoreFactoryDefaults();

    /**
    * In order to read encoder values an encoder object is created using the 
    * getEncoder() method from an existing CANSparkMax object
    */
    // m1_encoder = m1_motor.getEncoder();
    // m2_encoder = m2_motor.getEncoder();

    // m3_encoder = m3_motor.getEncoder();

    // m4_encoder = m4_motor.getEncoder();
    // m5_encoder = m5_motor.getEncoder();


    // m_stick = new Joystick(0);
  }

  @Override
  public void teleopPeriodic() {
    // set the motor output based on jostick position
    m1_motor.set(0.2);

    m2_motor.set(0.2);

    m3_motor.set(0.2);

    m4_motor.set(0.2);

    
    /**
     * Encoder position is read from a RelativeEncoder object by calling the
     * GetPosition() method.
     * 
     * GetPosition() returns the position of the encoder in units of revolutions
     */
    // SmartDashboard.putNumber("Encoder Position", m_encoder.getPosition());

    /**
     * Encoder velocity is read from a RelativeEncoder object by calling the
     * GetVelocity() method.
     * 
     * GetVelocity() returns the velocity of the encoder in units of RPM
     */
    // SmartDashboard.putNumber("Encoder Velocity", m_encoder.getVelocity());
  }
}
