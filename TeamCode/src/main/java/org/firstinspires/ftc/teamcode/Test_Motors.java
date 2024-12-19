package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name = "Test_Motors", group = "Utilities")
public class Test_Motors extends LinearOpMode {

    public DcMotor BL, BR, FR, FL, SL, SR;


    @Override
    public void runOpMode() {

        BL = hardwareMap.get(DcMotor.class, "back_left_motor");
        BR = hardwareMap.get(DcMotor.class, "back_right_motor");
        FR = hardwareMap.get(DcMotor.class, "front_right_motor");
        FL = hardwareMap.get(DcMotor.class, "front_left_motor");
        SR = hardwareMap.get(DcMotor.class, "slide_right");
        SL = hardwareMap.get(DcMotor.class, "slide_left");

        BL.setDirection(DcMotor.Direction.FORWARD);
        BR.setDirection(DcMotor.Direction.FORWARD);
        FR.setDirection(DcMotor.Direction.FORWARD);
        FL.setDirection(DcMotor.Direction.FORWARD);
        SL.setDirection(DcMotor.Direction.FORWARD);
        SR.setDirection(DcMotor.Direction.FORWARD);


        FL.setPower(1.0);
        sleep(2000);
        FL.setPower(0);
        FR.setPower(1.0);
        sleep(2000);
        FR.setPower(0);
        BR.setPower(1.0);
        sleep(2000);
        BR.setPower(0);
        BL.setPower(1.0);
        sleep(2000);
        BL.setPower(0);
        SL.setPower(.1);
        sleep(1000);
        SL.setPower(0);
        SR.setPower(.1);
        sleep(1000);
        SR.setPower(0);



    }
}

