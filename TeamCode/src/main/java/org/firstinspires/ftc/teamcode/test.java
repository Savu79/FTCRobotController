package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class test extends LinearOpMode {
    DcMotor motor;
    double pow=0;
    public void runOpMode(){
        motor = hardwareMap.get(DcMotor.class, "motor");

        waitForStart();

        while(opModeIsActive()){

            motor.setPower(pow);
        }

    }
}
