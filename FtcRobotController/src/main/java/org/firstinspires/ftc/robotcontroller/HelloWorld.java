package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

//Code to have the Driver Station read "Hello: World
@Autonomous
public class HelloWorld extends OpMode {
    @Override
    public void init() {
        telemetry.addData("Hello","Goober");
    }

    @Override
    public void loop() {

    }
}